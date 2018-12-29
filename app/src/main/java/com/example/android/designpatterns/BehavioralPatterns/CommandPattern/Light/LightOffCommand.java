package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Light;

/**
 * Created by MateuszW on 2018-04-17.
 */

//Concrete Command
public class LightOffCommand implements Command{
    //reference to the light
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}
