package com.fabric.factories.interior;

public enum InteriorType {

    LUXURY(6450),
    STANDARD (3500),
    ECONOM (2650);

    private final double value;

    InteriorType (final double newValue) {
        value = newValue;
    }
    public double getValue() { return value; }
}
