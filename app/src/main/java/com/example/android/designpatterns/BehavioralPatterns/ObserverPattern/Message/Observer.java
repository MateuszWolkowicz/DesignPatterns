package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.Message;

/**
 * Created by MateuszW on 2018-04-18.
 */

public interface Observer {
    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
