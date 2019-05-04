package com.fabric.factories.carbody;

public class CarBodyFactory {
      public static CarBody buildCarBody(CarBodyType model) {

        System.out.println("Building " + model  + " type with price of " + model.getValue() + " $ ");
        CarBody body = new CarBody(model);
        body.setPriceForCarBody(model.getValue());

        return body;
    }
}

