package com.fabric.factories.exterior;

public enum ExteriorType {

    LUXURY(7600),
    STANDARD (5000),
    ECONOM (3250);

    private final double value;

    ExteriorType (final double newValue) {
        value = newValue;
    }
    public double getValue() { return value; }
}
