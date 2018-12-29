package com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Created by MateuszW on 2018-03-21.
 */

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
