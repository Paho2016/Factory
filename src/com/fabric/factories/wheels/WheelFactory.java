package com.fabric.factories.wheels;

public class WheelFactory {
    public static Wheel buildWheel(WheelDriveType model) {

        System.out.println("Building " + model  + " type with price of " + model.getValue() + " $ ");
        Wheel wheel = new Wheel(model);
        wheel.setPriceForWheel(model.getValue());

        return wheel;
    }
}
