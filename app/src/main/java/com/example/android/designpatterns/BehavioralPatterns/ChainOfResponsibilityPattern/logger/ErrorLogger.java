package com.example.android.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.logger;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class ErrorLogger  extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
