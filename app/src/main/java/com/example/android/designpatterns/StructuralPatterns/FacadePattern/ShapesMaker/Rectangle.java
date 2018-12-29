package com.example.android.designpatterns.StructuralPatterns.FacadePattern.ShapesMaker;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
