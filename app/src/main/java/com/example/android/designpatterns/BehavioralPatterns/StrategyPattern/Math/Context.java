package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class Context {

    List<Strategy> strategies = new ArrayList<>();
    private Strategy strategy;
    public Context(){};
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

    public void addStrategy(Strategy strategy) {
        strategies.add(strategy);
    }

    public void executeStrategyAll(int num1, int num2){
        for (Strategy strategy :
                strategies) {
            System.out.println("All = 10 +/* 5 = " + strategy.doOperation(num1, num2));
        }
    }
}
