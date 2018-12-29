package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Light;

/**
 * Created by MateuszW on 2018-04-17.
 */


//LightDemo
public class LightDemo {
    public static void LoadLightDemo()    {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();

        //switcher
        Switch testSwitch = new Switch( lightsOn,lightsOff);
        //switch on
        testSwitch.flipUp( );
        //switch off
        testSwitch.flipDown( );
    }
}