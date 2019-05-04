package com.fabric.factories.engine;

public class Engine {

    private EngineType engineType;
    public double priceForEngine;

    Engine(EngineType model) {
        this.engineType = model;
    }

    public void setPriceForNurture(double priceForNurture) {
        this.priceForEngine = priceForNurture;
    }
    public EngineType getEngineType() { return engineType; }
}
