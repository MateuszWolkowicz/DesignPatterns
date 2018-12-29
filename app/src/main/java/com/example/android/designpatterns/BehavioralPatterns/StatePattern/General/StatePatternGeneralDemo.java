package com.example.android.designpatterns.BehavioralPatterns.StatePattern.General;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class StatePatternGeneralDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
