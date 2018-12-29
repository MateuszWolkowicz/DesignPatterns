package com.example.android.designpatterns.CreationalPatterns.PrototypePattern;

import com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes.Circle;
import com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes.Rectangle;
import com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes.Shape;
import com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes.Square;

import java.util.Hashtable;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);

    }

}
