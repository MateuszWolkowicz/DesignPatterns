package com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new AbstractShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new AbstractColorFactory();
        }

        return null;
    }

}
