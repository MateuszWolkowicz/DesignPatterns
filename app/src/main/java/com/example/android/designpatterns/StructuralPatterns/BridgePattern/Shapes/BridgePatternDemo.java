package com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes;

import com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes.Circles.GreenCircle;
import com.example.android.designpatterns.StructuralPatterns.BridgePattern.Shapes.Circles.RedCircle;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class BridgePatternDemo {

    public void LoadBridgePattern(){
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
