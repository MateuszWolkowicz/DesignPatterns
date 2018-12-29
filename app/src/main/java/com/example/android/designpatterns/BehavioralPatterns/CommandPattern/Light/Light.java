package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Light;

import android.util.Log;

/**
 * Created by MateuszW on 2018-04-17.
 */

//Receiver
public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
        Log.d("Light", "switch on");
    }

    public void switchOff() {
        on = false;
        Log.d("Light", "switch off");
    }
}