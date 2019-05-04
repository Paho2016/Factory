package com.fabric.factories.carbody;

public  enum CarBodyType {

    SEDAN_SPORTCAR(3850),
    SEDAN_BUSINESS(3000),
    SEDAN_ECONOM(2460),
    HATCHBACK(2850),
    CROSSOVER(5000),
    TRUCK(3450),
    TRACTOR(2840),
    MOTORCYCLE(3100);

    private final double value;

    CarBodyType (final double newValue) {
        value = newValue;
    }
    public double getValue() { return value; }
}