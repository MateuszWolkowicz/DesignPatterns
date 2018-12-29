package com.example.android.designpatterns.BehavioralPatterns.VisitorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
