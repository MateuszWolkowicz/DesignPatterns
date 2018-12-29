package com.example.android.designpatterns.BehavioralPatterns.VisitorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public interface  ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
