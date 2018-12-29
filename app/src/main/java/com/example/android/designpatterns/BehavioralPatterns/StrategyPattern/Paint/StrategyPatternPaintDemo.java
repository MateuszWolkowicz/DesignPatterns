package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Paint;

public class StrategyPatternPaintDemo {

    public static void main(String[] args) {

        Painter painter;
        painter = new Painter(new RedSquarePainter());
        painter.paintRighNow("1");

        painter = new Painter(new YellowSquarePainter());
        painter.paintRighNow("10");

    }

}
