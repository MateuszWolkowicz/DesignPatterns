package com.example.android.designpatterns.BehavioralPatterns.StatePattern.General;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
