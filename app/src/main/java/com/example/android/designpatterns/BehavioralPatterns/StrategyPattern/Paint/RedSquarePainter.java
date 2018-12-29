package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Paint;

public class RedSquarePainter implements  Paint{
    @Override
    public void paint(String quantity) {
        System.out.println("I'm a Red Square : quantity = " + quantity);
    }
}
