package com.example.android.designpatterns.BehavioralPatterns.InterpreterPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
