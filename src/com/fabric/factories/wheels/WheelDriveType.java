package com.fabric.factories.wheels;

public enum WheelDriveType {

    REAR_WHEEL_DRIVE(1300),
    FRONT_WHEEL_DRIVE(1000),
    BACK_WHEEL_DRIVE(850);

    private final double value;

    WheelDriveType (final double newValue) {
        value = newValue;
    }
    public double getValue() { return value; }
}
