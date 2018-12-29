package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Paint;

public class YellowSquarePainter implements  Paint{
    @Override
    public void paint(String quantity) {
        System.out.println("I'm a Yellow Square: quantity = " + quantity);
    }
}
