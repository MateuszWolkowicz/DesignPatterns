package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.PrivateConstructorAndEnum;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleTypes vehicleTypes) {
        if (vehicleTypes == null) {
            return null;
        }
        Vehicle vehicle = null;
        switch (vehicleTypes) {
            case CAR:
                vehicle = Car.create();
                break;
            case TRUCK:
                vehicle = Truck.create();
                break;
            case MOTORCYCLE:
                vehicle = Motorcycle.create();
                break;
            default:
                vehicle = null;
        }
        return vehicle;
    }

}
