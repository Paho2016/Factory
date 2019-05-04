package com.fabric.factories.carbody;

public class CarBody {

    private CarBodyType carBodyType;
    public double priceForCarBody;

    CarBody(CarBodyType model) {
        this.carBodyType = model;
    }

    public void setPriceForCarBody(double priceForCarBody) {
        this.priceForCarBody = priceForCarBody;
    }
    public CarBodyType getCarBodyType() { return carBodyType; }
}
