package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.NumberSystems;

/**
 * Created by MateuszW on 2018-04-18.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
