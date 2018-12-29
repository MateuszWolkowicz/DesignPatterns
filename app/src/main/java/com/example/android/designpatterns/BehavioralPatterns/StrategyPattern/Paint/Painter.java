package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Paint;

public class Painter {

    private Paint paint;

    public Painter(Paint paint) {
        this.paint = paint;
    }

    public void paintRighNow(String quantity) {
        paint.paint(quantity);
    }

}
