package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.Shapes;

import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.Shape;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
