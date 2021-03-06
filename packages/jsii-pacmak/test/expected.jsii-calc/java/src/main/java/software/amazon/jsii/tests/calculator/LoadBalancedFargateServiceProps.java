package software.amazon.jsii.tests.calculator;

/**
 * jsii#298: show default values in sphinx documentation, and respect newlines.
 * 
 * EXPERIMENTAL
 */
@javax.annotation.Generated(value = "jsii-pacmak")
@software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
public interface LoadBalancedFargateServiceProps extends software.amazon.jsii.JsiiSerializable {
    /**
     * The container port of the application load balancer attached to your Fargate service.
     * 
     * Corresponds to container port mapping.
     * 
     * Default: 80
     * 
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.Number getContainerPort();
    /**
     * The number of cpu units used by the task. Valid values, which determines your range of valid values for the memory parameter: 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments.
     * 
     * This default is set in the underlying FargateTaskDefinition construct.
     * 
     * Default: 256
     * 
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.String getCpu();
    /**
     * The amount (in MiB) of memory used by the task.
     * 
     * This field is required and you must use one of the following values, which determines your range of valid values
     * for the cpu parameter:
     * 
     * 0.5GB, 1GB, 2GB - Available cpu values: 256 (.25 vCPU)
     * 
     * 1GB, 2GB, 3GB, 4GB - Available cpu values: 512 (.5 vCPU)
     * 
     * 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB - Available cpu values: 1024 (1 vCPU)
     * 
     * Between 4GB and 16GB in 1GB increments - Available cpu values: 2048 (2 vCPU)
     * 
     * Between 8GB and 30GB in 1GB increments - Available cpu values: 4096 (4 vCPU)
     * 
     * This default is set in the underlying FargateTaskDefinition construct.
     * 
     * Default: 512
     * 
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.String getMemoryMiB();
    /**
     * Determines whether the Application Load Balancer will be internet-facing.
     * 
     * Default: true
     * 
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.Boolean getPublicLoadBalancer();
    /**
     * Determines whether your Fargate Service will be assigned a public IP address.
     * 
     * Default: false
     * 
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.Boolean getPublicTasks();

    /**
     * @return a {@link Builder} of {@link LoadBalancedFargateServiceProps}
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    static Builder builder() {
        return new Builder();
    }

    /**
     * A builder for {@link LoadBalancedFargateServiceProps}
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    final class Builder {
        @javax.annotation.Nullable
        private java.lang.Number _containerPort;
        @javax.annotation.Nullable
        private java.lang.String _cpu;
        @javax.annotation.Nullable
        private java.lang.String _memoryMiB;
        @javax.annotation.Nullable
        private java.lang.Boolean _publicLoadBalancer;
        @javax.annotation.Nullable
        private java.lang.Boolean _publicTasks;

        /**
         * Sets the value of ContainerPort
         * @param value The container port of the application load balancer attached to your Fargate service.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withContainerPort(@javax.annotation.Nullable final java.lang.Number value) {
            this._containerPort = value;
            return this;
        }
        /**
         * Sets the value of Cpu
         * @param value The number of cpu units used by the task. Valid values, which determines your range of valid values for the memory parameter: 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withCpu(@javax.annotation.Nullable final java.lang.String value) {
            this._cpu = value;
            return this;
        }
        /**
         * Sets the value of MemoryMiB
         * @param value The amount (in MiB) of memory used by the task.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withMemoryMiB(@javax.annotation.Nullable final java.lang.String value) {
            this._memoryMiB = value;
            return this;
        }
        /**
         * Sets the value of PublicLoadBalancer
         * @param value Determines whether the Application Load Balancer will be internet-facing.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withPublicLoadBalancer(@javax.annotation.Nullable final java.lang.Boolean value) {
            this._publicLoadBalancer = value;
            return this;
        }
        /**
         * Sets the value of PublicTasks
         * @param value Determines whether your Fargate Service will be assigned a public IP address.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withPublicTasks(@javax.annotation.Nullable final java.lang.Boolean value) {
            this._publicTasks = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LoadBalancedFargateServiceProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public LoadBalancedFargateServiceProps build() {
            return new LoadBalancedFargateServiceProps() {
                @javax.annotation.Nullable
                private final java.lang.Number $containerPort = _containerPort;
                @javax.annotation.Nullable
                private final java.lang.String $cpu = _cpu;
                @javax.annotation.Nullable
                private final java.lang.String $memoryMiB = _memoryMiB;
                @javax.annotation.Nullable
                private final java.lang.Boolean $publicLoadBalancer = _publicLoadBalancer;
                @javax.annotation.Nullable
                private final java.lang.Boolean $publicTasks = _publicTasks;

                @Override
                public java.lang.Number getContainerPort() {
                    return this.$containerPort;
                }

                @Override
                public java.lang.String getCpu() {
                    return this.$cpu;
                }

                @Override
                public java.lang.String getMemoryMiB() {
                    return this.$memoryMiB;
                }

                @Override
                public java.lang.Boolean getPublicLoadBalancer() {
                    return this.$publicLoadBalancer;
                }

                @Override
                public java.lang.Boolean getPublicTasks() {
                    return this.$publicTasks;
                }

                public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
                    com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
                    com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
                    if (this.getContainerPort() != null) {
                        obj.set("containerPort", om.valueToTree(this.getContainerPort()));
                    }
                    if (this.getCpu() != null) {
                        obj.set("cpu", om.valueToTree(this.getCpu()));
                    }
                    if (this.getMemoryMiB() != null) {
                        obj.set("memoryMiB", om.valueToTree(this.getMemoryMiB()));
                    }
                    if (this.getPublicLoadBalancer() != null) {
                        obj.set("publicLoadBalancer", om.valueToTree(this.getPublicLoadBalancer()));
                    }
                    if (this.getPublicTasks() != null) {
                        obj.set("publicTasks", om.valueToTree(this.getPublicTasks()));
                    }
                    return obj;
                }

            };
        }
    }

    /**
     * A proxy class which represents a concrete javascript instance of this type.
     */
    final static class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements software.amazon.jsii.tests.calculator.LoadBalancedFargateServiceProps {
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObject.InitializationMode mode) {
            super(mode);
        }

        /**
         * The container port of the application load balancer attached to your Fargate service.
         * 
         * Corresponds to container port mapping.
         * 
         * Default: 80
         * 
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.Number getContainerPort() {
            return this.jsiiGet("containerPort", java.lang.Number.class);
        }

        /**
         * The number of cpu units used by the task. Valid values, which determines your range of valid values for the memory parameter: 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments.
         * 
         * This default is set in the underlying FargateTaskDefinition construct.
         * 
         * Default: 256
         * 
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.String getCpu() {
            return this.jsiiGet("cpu", java.lang.String.class);
        }

        /**
         * The amount (in MiB) of memory used by the task.
         * 
         * This field is required and you must use one of the following values, which determines your range of valid values
         * for the cpu parameter:
         * 
         * 0.5GB, 1GB, 2GB - Available cpu values: 256 (.25 vCPU)
         * 
         * 1GB, 2GB, 3GB, 4GB - Available cpu values: 512 (.5 vCPU)
         * 
         * 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB - Available cpu values: 1024 (1 vCPU)
         * 
         * Between 4GB and 16GB in 1GB increments - Available cpu values: 2048 (2 vCPU)
         * 
         * Between 8GB and 30GB in 1GB increments - Available cpu values: 4096 (4 vCPU)
         * 
         * This default is set in the underlying FargateTaskDefinition construct.
         * 
         * Default: 512
         * 
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.String getMemoryMiB() {
            return this.jsiiGet("memoryMiB", java.lang.String.class);
        }

        /**
         * Determines whether the Application Load Balancer will be internet-facing.
         * 
         * Default: true
         * 
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.Boolean getPublicLoadBalancer() {
            return this.jsiiGet("publicLoadBalancer", java.lang.Boolean.class);
        }

        /**
         * Determines whether your Fargate Service will be assigned a public IP address.
         * 
         * Default: false
         * 
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.Boolean getPublicTasks() {
            return this.jsiiGet("publicTasks", java.lang.Boolean.class);
        }
    }
}
