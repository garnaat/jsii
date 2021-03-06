/*
 * Installs repo-local dependencies manually, as lerna ignores those...
 */
const { exec, execSync } = require('child_process');
const { removeSync, mkdirpSync, pathExistsSync, symlinkSync, writeJsonSync } = require('fs-extra');
const { dirname, join, relative, resolve } = require('path');

exec('lerna ls --json --all', { shell: true }, (error, stdout) => {
  if (error) {
    console.error('Error: ', error);
    process.exit(-1);
  }
  const modules = JSON.parse(stdout.toString('utf8'));
  for (const module of modules.reverse()) {
    const packageInfo = require(join(module.location, 'package.json'));
    if (process.env.VERBOSE) {
      console.log(`Installing local dependencies of ${module.name}`);
    }
    installDeps(module.location,
      { depList: packageInfo.dependencies },
      { depList: packageInfo.devDependencies, dev: true });
  }
  console.log('Done.');
});

function installDeps(location, ...depLists) {
  const nodeModules = join(location, 'node_modules');
  const lockFile = join(location, 'package-lock.json');

  const locks = pathExistsSync(lockFile) && require(lockFile);

  const linked = new Set();
  const paths = [];
  for (const { depList, dev } of depLists) {
    Object.entries(depList || {})
      .forEach(([name, version]) => {
        if (linked.has(name)) { return; }
        const matched = version.match(/^file:(.+)$/);
        if (!matched) { return; }
        const path = matched[1];
        const modulePath = resolve(location, path);
        const requires = installDependency(nodeModules, modulePath);
        linked.add(name);
        paths.push(path);
        if (locks) {
          locks.dependencies[name] = { version, dev, requires };
        }
      });
  }
  if (process.env.VERBOSE) {
    console.log(`Fixing up package-lock.json in ${location}`);
  }
  if (locks) {
    sortKeys(locks.dependencies);
    writeJsonSync(lockFile, locks, { spaces: '\t' });
  } else {
    // This is dog slow, hence we're playing funky games elsewhere... but we're not in the business of bootstrapping
    // a lock-file from scratch, so if there was none, let npm do it's thing instead of trying to replicate.
    execSync(`npm install --package-lock-only ${paths.join(' ')}`, { cwd: location, shell: true });
  }

}

/**
 * Installs a symlink to a local package, and symlinks any "bin" items into the node_modules/.bin directory
 * @param {string} nodeModules the root of the "installing" node_modules directory
 * @param {string} localPath   the path of the "installed" module
 */
function installDependency(nodeModules, localPath) {
  const packageInfo = require(`${localPath}/package.json`);

  const linkLocation = join(nodeModules, packageInfo.name);

  mkdirpSync(dirname(linkLocation));

  if (pathExistsSync(linkLocation)) {
    if (process.env.VERBOSE) {
      console.log(`Re-linking ${linkLocation} to ${localPath}`);
    }
    removeSync(linkLocation);
  }

  symlinkSync(localPath, linkLocation);

  if (packageInfo.bin) {
    const bin = join(nodeModules, '.bin');
    mkdirpSync(bin);
    for (const [name, cmd] of Object.entries(packageInfo.bin)) {
      const binLink = join(bin, name);
      const linkTarget = join('..', packageInfo.name, cmd);
      if (pathExistsSync(binLink)) {
        if (process.env.VERBOSE) {
          console.log(`Re-linking ${binLink} to ${linkTarget}`);
        }
        removeSync(binLink);
      }
      symlinkSync(linkTarget, binLink);
    }
  }

  return packageInfo.dependencies;
}

function sortKeys(object) {
  if (!object) {
    return object;
  }
  const sorted = {};
  for (const key of Object.keys(object).sort()) {
    sorted[key] = object[key];
  }
  return sorted;
}
