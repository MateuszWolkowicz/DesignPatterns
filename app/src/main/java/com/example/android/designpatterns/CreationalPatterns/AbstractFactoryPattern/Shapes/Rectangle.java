package com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shapes;

import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shape;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
