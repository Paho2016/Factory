package com.fabric.factories.engine;

public enum EngineType {

    ELECTRICAL(3500),
    DIESEL(2500),
    PETROL(2000),
    HYBRID(2850);

    private final double value;

    EngineType (final double newValue) {
        value = newValue;
    }
    public double getValue() { return value; }
}
