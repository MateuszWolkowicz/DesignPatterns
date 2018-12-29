package com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes;

/**
 * Created by MateuszW on 2018-03-22.
 */

public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
