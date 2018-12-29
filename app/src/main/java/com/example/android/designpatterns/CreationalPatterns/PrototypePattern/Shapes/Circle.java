package com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
