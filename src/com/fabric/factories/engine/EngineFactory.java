package com.fabric.factories.engine;

public class EngineFactory {
    public static Engine buildEngine(EngineType model) {

        System.out.println("Building " + model  + " type with price of " + model.getValue() + " $ ");
        Engine engine = new Engine(model);
        engine.setPriceForNurture(model.getValue());

        return engine;
    }
}
