package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.SearchSolution;

public class StrategyPatternSearchSolutionDemo {

    private static void execute(Strategy strategy) {
        strategy.solve();
    }


    public static void main( String[] args ) {
        Strategy[] algorithms = {new FOO(), new BAR()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }

}
