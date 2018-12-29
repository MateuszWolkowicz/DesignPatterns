package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.PrivateConstructorAndEnum;

import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.kotlin.KotlinVehicleFactory;

public class FactoryMethodPatternVehicleDemo {

    public static void  main(String[] args) {
        Vehicle vehicle ;
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicle = vehicleFactory.getVehicle(VehicleTypes.CAR);
        vehicle.design();
        vehicle.manufacturer();
        vehicle = vehicleFactory.getVehicle(VehicleTypes.MOTORCYCLE);
        vehicle.design();
        vehicle.manufacturer();
        vehicle = vehicleFactory.getVehicle(VehicleTypes.TRUCK);
        vehicle.design();
        vehicle.manufacturer();
        //kotlin
        System.out.println("-- Kotlin factory --");
        KotlinVehicleFactory kotlinVehicleFactory = new KotlinVehicleFactory();
        vehicle = kotlinVehicleFactory.getVehicle(VehicleTypes.TRUCK);
        vehicle.design();
        vehicle.manufacturer();
    }

}
