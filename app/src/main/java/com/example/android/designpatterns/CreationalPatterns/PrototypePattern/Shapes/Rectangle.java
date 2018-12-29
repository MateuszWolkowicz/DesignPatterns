package com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
