package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Light;

/**
 * Created by MateuszW on 2018-04-17.
 */

//Invoker
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}