package com.fabric.service;

import com.carfabric.factories.carbody.CarBody;
import com.carfabric.factories.carbody.CarBodyFactory;
import com.carfabric.factories.engine.Engine;
import com.carfabric.factories.engine.EngineFactory;
import com.carfabric.factories.exterior.Exterior;
import com.carfabric.factories.exterior.ExteriorFactory;
import com.carfabric.factories.interior.Interior;
import com.carfabric.factories.interior.InteriorFactory;
import com.carfabric.factories.wheels.Wheel;
import com.carfabric.factories.wheels.WheelFactory;

public class CarServiceManager {
    CarPartAsker ask = new CarPartAsker();

    CarServiceManager(){}

    Engine arrangeEngine(){
        return EngineFactory.buildEngine(ask.askEngine());
    }
    CarBody arrangeCarBody(){return CarBodyFactory.buildCarBody(ask.askCarBody());}
    Wheel arrangeWheel() {return WheelFactory.buildWheel(ask.askWheel());}
    Interior arrangeInterior() {return InteriorFactory.buildInterior(ask.askInterior());}
    Exterior arrangeExterior() {return ExteriorFactory.buildExterior(ask.askExterior());}
    }


