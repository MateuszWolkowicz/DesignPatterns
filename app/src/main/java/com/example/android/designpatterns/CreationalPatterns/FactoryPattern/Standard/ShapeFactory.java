package com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard;

import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.Shapes.Circle;
import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.Shapes.Rectangle;
import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.Shapes.Square;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (null == shapeType) {
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
