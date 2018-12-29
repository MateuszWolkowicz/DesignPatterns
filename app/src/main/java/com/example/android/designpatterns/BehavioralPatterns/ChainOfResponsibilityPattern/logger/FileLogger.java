package com.example.android.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.logger;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
