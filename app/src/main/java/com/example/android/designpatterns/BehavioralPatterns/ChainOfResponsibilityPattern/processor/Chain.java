package com.example.android.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.processor;

public interface Chain {

    void next(Chain nextInChain);
    void process(Number request);
}
