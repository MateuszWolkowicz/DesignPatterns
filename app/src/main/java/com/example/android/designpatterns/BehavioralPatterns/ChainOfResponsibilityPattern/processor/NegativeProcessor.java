package com.example.android.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.processor;

public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void next(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
