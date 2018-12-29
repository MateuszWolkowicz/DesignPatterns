package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.PrivateConstructorAndEnum;

public class Car implements Vehicle {

   private Car() {
    }

    public static Car create() {
       return new Car();
    }

    @Override
    public void design() {
        System.out.println("Designing Car");
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufactoring Car");
    }
}
