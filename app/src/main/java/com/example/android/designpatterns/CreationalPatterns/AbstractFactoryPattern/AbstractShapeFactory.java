package com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern;

import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Color;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shape;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shapes.Circle;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shapes.Rectangle;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shapes.Square;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class AbstractShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
