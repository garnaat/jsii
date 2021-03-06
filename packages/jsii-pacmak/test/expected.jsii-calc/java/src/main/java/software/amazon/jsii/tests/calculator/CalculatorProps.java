package software.amazon.jsii.tests.calculator;

/**
 * Properties for Calculator.
 * 
 * EXPERIMENTAL
 */
@javax.annotation.Generated(value = "jsii-pacmak")
@software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
public interface CalculatorProps extends software.amazon.jsii.JsiiSerializable {
    /**
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.Number getInitialValue();
    /**
     * EXPERIMENTAL
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    java.lang.Number getMaximumValue();

    /**
     * @return a {@link Builder} of {@link CalculatorProps}
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    static Builder builder() {
        return new Builder();
    }

    /**
     * A builder for {@link CalculatorProps}
     */
    @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
    final class Builder {
        @javax.annotation.Nullable
        private java.lang.Number _initialValue;
        @javax.annotation.Nullable
        private java.lang.Number _maximumValue;

        /**
         * Sets the value of InitialValue
         * @param value the value to be set
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withInitialValue(@javax.annotation.Nullable final java.lang.Number value) {
            this._initialValue = value;
            return this;
        }
        /**
         * Sets the value of MaximumValue
         * @param value the value to be set
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder withMaximumValue(@javax.annotation.Nullable final java.lang.Number value) {
            this._maximumValue = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CalculatorProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public CalculatorProps build() {
            return new CalculatorProps() {
                @javax.annotation.Nullable
                private final java.lang.Number $initialValue = _initialValue;
                @javax.annotation.Nullable
                private final java.lang.Number $maximumValue = _maximumValue;

                @Override
                public java.lang.Number getInitialValue() {
                    return this.$initialValue;
                }

                @Override
                public java.lang.Number getMaximumValue() {
                    return this.$maximumValue;
                }

                public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
                    com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
                    com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
                    if (this.getInitialValue() != null) {
                        obj.set("initialValue", om.valueToTree(this.getInitialValue()));
                    }
                    if (this.getMaximumValue() != null) {
                        obj.set("maximumValue", om.valueToTree(this.getMaximumValue()));
                    }
                    return obj;
                }

            };
        }
    }

    /**
     * A proxy class which represents a concrete javascript instance of this type.
     */
    final static class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements software.amazon.jsii.tests.calculator.CalculatorProps {
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObject.InitializationMode mode) {
            super(mode);
        }

        /**
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.Number getInitialValue() {
            return this.jsiiGet("initialValue", java.lang.Number.class);
        }

        /**
         * EXPERIMENTAL
         */
        @Override
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @javax.annotation.Nullable
        public java.lang.Number getMaximumValue() {
            return this.jsiiGet("maximumValue", java.lang.Number.class);
        }
    }
}
