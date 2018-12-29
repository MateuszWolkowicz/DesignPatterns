package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.SearchSolution;

public abstract class StrategySearch  implements Strategy {
    public void solve() {
        while (true) {
            preProcess();
            if (search()) {
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();
}
