package com.example.android.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.logger;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
