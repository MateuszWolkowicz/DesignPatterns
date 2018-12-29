package com.example.android.designpatterns.BehavioralPatterns.VisitorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
