package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.SearchSolution;

public abstract class StrategySolution implements Strategy {

    public void solve() {
        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}
