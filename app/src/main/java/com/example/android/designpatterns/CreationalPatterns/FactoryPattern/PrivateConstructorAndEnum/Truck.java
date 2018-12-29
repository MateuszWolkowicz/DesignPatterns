package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.PrivateConstructorAndEnum;

public class Truck implements Vehicle {

    private Truck() {
    }

    public static Vehicle create() {
        return new Truck();
    }

    @Override
    public void design() {
        System.out.println("Designing Truck");
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufactoring Truck");
    }
}
