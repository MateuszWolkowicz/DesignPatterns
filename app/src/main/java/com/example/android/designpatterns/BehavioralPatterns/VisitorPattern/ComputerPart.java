package com.example.android.designpatterns.BehavioralPatterns.VisitorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
