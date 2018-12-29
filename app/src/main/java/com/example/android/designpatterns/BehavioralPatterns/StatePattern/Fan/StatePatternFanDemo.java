package com.example.android.designpatterns.BehavioralPatterns.StatePattern.Fan;

public class StatePatternFanDemo {


    public static void main(String[] args){
        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

    }
}
