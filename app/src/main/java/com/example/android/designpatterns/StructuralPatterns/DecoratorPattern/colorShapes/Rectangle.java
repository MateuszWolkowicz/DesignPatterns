package com.example.android.designpatterns.StructuralPatterns.DecoratorPattern.colorShapes;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
