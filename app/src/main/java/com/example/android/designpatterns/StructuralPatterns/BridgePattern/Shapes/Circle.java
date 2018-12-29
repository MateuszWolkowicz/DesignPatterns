package com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class Circle extends Shape {
    private int x, y, radius;

    protected Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
