package com.example.android.designpatterns.StructuralPatterns.DecoratorPattern.colorShapes;

/**
 * Created by MateuszW on 2018-04-18.
 */

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }

}
