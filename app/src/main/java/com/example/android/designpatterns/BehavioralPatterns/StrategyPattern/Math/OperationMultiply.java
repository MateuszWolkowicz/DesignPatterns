package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
