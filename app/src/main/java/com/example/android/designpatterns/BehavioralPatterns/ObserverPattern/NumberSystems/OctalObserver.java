package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.NumberSystems;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
