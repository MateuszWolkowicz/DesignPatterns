package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.kotlin

import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.PrivateConstructorAndEnum.*

class KotlinVehicleFactory {

    fun getVehicle(vehicleTypes: VehicleTypes?): Vehicle? {
        if (vehicleTypes == null) {
            return null
        }
        var vehicle: Vehicle? = null
        when (vehicleTypes) {
            VehicleTypes.CAR -> vehicle = Car.create()
            VehicleTypes.TRUCK -> vehicle = Truck.create()
            VehicleTypes.MOTORCYCLE -> vehicle = Motorcycle.create()
            else -> vehicle = null
        }
        return vehicle
    }

}