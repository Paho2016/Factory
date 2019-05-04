package com.fabric.service;

import com.carfabric.factories.carbody.CarBodyType;
import com.carfabric.factories.engine.EngineType;
import com.carfabric.factories.exterior.ExteriorType;
import com.carfabric.factories.interior.InteriorType;
import com.carfabric.factories.wheels.WheelDriveType;

import java.util.Scanner;

public class CarPartAsker {

    Scanner scanner = new Scanner(System.in);
    public CarPartAsker(){}


    String askAnything(String[] wishedType, String aType){
        for (String s: wishedType) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Select which " + aType + " type you want: ");

        String userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();

        if(!checkInput(wishedType, userInput)){
            System.out.println("Choose correct version! ");
            askAnything(wishedType, aType);
        }
        return userInput;
    }

    EngineType askEngine(){
        String[] engineTypes = {"ELECTRICAL", "DIESEL", "PETROL", "HYBRID"};
        String aType = "engine";
        String userEngine = askAnything(engineTypes, aType);

        return EngineType.valueOf(userEngine);
    }

    static CarBodyType CAR_BODY;

    CarBodyType askCarBody(){
        String[] carBodyTypes = {"SEDAN_SPORTCAR", "SEDAN_BUSINESS", "SEDAN_ECONOM", "CROSSOVER", "HATCHBACK", "TRACTOR", "TRUCK", "MOTORCYCLE"};
        String aType = "car";
        String userCarBody = askAnything(carBodyTypes, aType);

         CarBodyType bodyType = CarBodyType.valueOf(userCarBody);
         CAR_BODY = bodyType;

        return bodyType;
    }

    WheelDriveType askWheel(){
        String[] wheelTypes = {"REAR_WHEEL_DRIVE", "FRONT_WHEEL_DRIVE", "BACK_WHEEL_DRIVE"};

        if(CAR_BODY == CarBodyType.MOTORCYCLE) {
          wheelTypes = new String[]{"BACK_WHEEL_DRIVE"};
        }

        String aType = "wheel";
        String userWheelType = askAnything(wheelTypes, aType);

        return WheelDriveType.valueOf(userWheelType);
    }

    InteriorType askInterior(){

        String[] interiorTypes = {"LUXURY", "STANDARD", "ECONOM"};
        String aType = "interior";
        String userInteriorType= askAnything(interiorTypes, aType);

        return InteriorType.valueOf(userInteriorType);
    }

    ExteriorType askExterior(){

        String[] exteriorTypes = {"LUXURY", "STANDARD", "ECONOM"};
        String aType = "exterior";
        String userExteriorType= askAnything(exteriorTypes, aType);

        return ExteriorType.valueOf(userExteriorType);
    }

    protected boolean checkInput(String[] allowedTypes, String input){
        for (String allowed: allowedTypes) {
            if(input.equals(allowed)){
                return true;
            }
        }
        return false;
    }
}
