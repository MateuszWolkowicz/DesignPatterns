package com.example.android.designpatterns.BehavioralPatterns.StatePattern.Fan;

public abstract class State {


    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }
}
