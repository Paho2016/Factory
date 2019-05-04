package com.fabric;

import com.carfabric.service.Car;

public class Calculator {

    private static Car car;
    static double totalPrice;

    public Calculator(Car car){ this.car = car;}

    static void totalAmount(){
        totalPrice+= car.carBodyModel.priceForCarBody + car.engineModel.priceForEngine + car.wheelModel.priceForWheel +
                car.interiorModel.priceForInterior + car.exteriorModel.priceForExterior ;
    }

    void priceOfBoughtGoods(){
        totalAmount();
        System.out.println("Car body type: " + car.carBodyModel.getCarBodyType() + " " + car.carBodyModel.priceForCarBody + " $");
        System.out.println("Car engine type: " + car.engineModel.getEngineType() + " " + car.engineModel.priceForEngine + " $" );
        System.out.println("Car derivation type: " + car.wheelModel.getWheelType() + " " + car.wheelModel.priceForWheel + " $" );
        System.out.println("Car interior type: " + car.interiorModel.getInteriorType() + " " + car.interiorModel.priceForInterior + " $" );
        System.out.println("Car exterior type: " + car.exteriorModel.getExteriorType() + " " + car.exteriorModel.priceForExterior + " $");
        System.out.print("Total Price: " + totalPrice + " $");
    }
}
