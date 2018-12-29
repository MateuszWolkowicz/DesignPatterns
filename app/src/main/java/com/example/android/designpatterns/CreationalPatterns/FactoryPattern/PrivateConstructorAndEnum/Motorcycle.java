package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.PrivateConstructorAndEnum;

public class Motorcycle implements Vehicle {

    private Motorcycle() {
    }

    public static Vehicle create() {
        return new Motorcycle();
    }

    @Override
    public void design() {
        System.out.println("Designing Motorcycle");
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufactoring Motorcycle");
    }
}