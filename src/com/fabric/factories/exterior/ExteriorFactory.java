package com.fabric.factories.exterior;

public class ExteriorFactory {
    public static Exterior buildExterior(ExteriorType model) {

        System.out.println("Building " + model  + " type with price of " + model.getValue() + " $ ");
        Exterior exterior = new Exterior(model);
        exterior.setPriceForInterior(model.getValue());

        return exterior;
    }
}
