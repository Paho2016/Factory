package com.fabric.factories.wheels;

public class Wheel {

    private WheelDriveType wheelType;
    public double priceForWheel;

    Wheel(WheelDriveType model) {
        this.wheelType = model;
    }

    public void setPriceForWheel(double priceForWheel) { this.priceForWheel = priceForWheel; }
    public WheelDriveType getWheelType() { return wheelType; }
}
