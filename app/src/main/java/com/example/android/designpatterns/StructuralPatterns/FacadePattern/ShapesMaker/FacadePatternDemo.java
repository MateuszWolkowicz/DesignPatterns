package com.example.android.designpatterns.StructuralPatterns.FacadePattern.ShapesMaker;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
