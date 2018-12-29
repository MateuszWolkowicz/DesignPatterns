package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.Message;

/**
 * Created by MateuszW on 2018-04-18.
 */

public interface Subject {
    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer obj);
}
