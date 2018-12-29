package com.example.android.designpatterns.StructuralPatterns.FacadePattern.ShapesMaker;



/**
 * Created by MateuszW on 2018-03-21.
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
