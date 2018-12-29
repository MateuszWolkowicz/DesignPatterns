package com.example.android.designpatterns.BehavioralPatterns.StatePattern.General;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
