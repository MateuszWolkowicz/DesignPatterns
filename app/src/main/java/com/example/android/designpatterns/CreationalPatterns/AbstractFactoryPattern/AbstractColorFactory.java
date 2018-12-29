package com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern;

import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Color;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Colors.Blue;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Colors.Green;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Colors.Red;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shape;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class AbstractColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {

        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }


    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
