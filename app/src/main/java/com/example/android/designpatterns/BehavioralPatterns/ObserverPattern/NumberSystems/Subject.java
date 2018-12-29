package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.NumberSystems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
