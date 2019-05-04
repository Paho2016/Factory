package com.fabric;

import com.carfabric.service.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.arrangeParts();

        Calculator calculator = new Calculator(car);
        calculator.priceOfBoughtGoods();
    }
}
