package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Light;


//Concrete Command
public class LightOnCommand implements Command{
    //reference to the light
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();
    }
}