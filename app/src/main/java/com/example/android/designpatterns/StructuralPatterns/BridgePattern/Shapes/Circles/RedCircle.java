package com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes.Circles;

import com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes.DrawApi;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
