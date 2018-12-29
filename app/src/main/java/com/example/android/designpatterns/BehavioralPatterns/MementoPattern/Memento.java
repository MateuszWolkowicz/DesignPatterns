package com.example.android.designpatterns.BehavioralPatterns.MementoPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
