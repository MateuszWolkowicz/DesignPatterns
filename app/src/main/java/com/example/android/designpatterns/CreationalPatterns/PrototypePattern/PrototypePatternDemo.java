package com.example.android.designpatterns.CreationalPatterns.PrototypePattern;

import com.example.android.designpatterns.CreationalPatterns.PrototypePattern.Shapes.Shape;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class PrototypePatternDemo {

    public void LoadPrototypePatternDemo() {

        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape1 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape2.getType());


    }

}
