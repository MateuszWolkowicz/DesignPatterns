package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.NumberSystems;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
