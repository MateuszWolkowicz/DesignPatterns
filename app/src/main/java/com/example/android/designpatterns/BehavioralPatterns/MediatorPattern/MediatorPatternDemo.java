package com.example.android.designpatterns.BehavioralPatterns.MediatorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
