package com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
