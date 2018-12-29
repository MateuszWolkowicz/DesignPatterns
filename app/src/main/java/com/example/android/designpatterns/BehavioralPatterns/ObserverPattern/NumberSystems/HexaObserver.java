package com.example.android.designpatterns.BehavioralPatterns.ObserverPattern.NumberSystems;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
