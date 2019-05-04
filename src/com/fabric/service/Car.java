package com.fabric.service;

import com.carfabric.factories.carbody.CarBody;
import com.carfabric.factories.engine.Engine;
import com.carfabric.factories.exterior.Exterior;
import com.carfabric.factories.interior.Interior;
import com.carfabric.factories.wheels.Wheel;

public  class Car {

    public CarBody carBodyModel;
    public Engine engineModel;
    public Wheel wheelModel;
    public Interior interiorModel;
    public Exterior exteriorModel;

    public  Car() {}

    public void arrangeParts(){
        CarServiceManager service = new CarServiceManager();
        construct();
        setCarBody(service.arrangeCarBody());
        setEngine(service.arrangeEngine());
        setWheel(service.arrangeWheel());
        setInteriorModel(service.arrangeInterior());
        setExteriorModel(service.arrangeExterior());
    }

    void setCarBody (CarBody model) {this.carBodyModel = model;}
    void setEngine (Engine model){ this.engineModel = model; }
    void setWheel (Wheel model){
        this.wheelModel = model;
    }
    void setInteriorModel (Interior model){
        this.interiorModel = model;
    }
    void setExteriorModel (Exterior model) {this.exteriorModel = model;}

    void construct(){
        System.out.println("Starting the construction of the CAR!");
    }
}