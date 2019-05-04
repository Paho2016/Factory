package com.fabric.factories.interior;

public class InteriorFactory {
    public static Interior buildInterior(InteriorType model) {

        System.out.println("Building " + model  + " type with price of " + model.getValue() + " $ ");
        Interior interior = new Interior(model);
        interior.setPriceForInterior(model.getValue());

        return interior;
    }
}
