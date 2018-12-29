package com.example.android.designpatterns.BehavioralPatterns.ChainOfResponsibilityPattern.processor;

public class ChainPatternProcessorDemo {

    public static void main(String[] args) {
        NegativeProcessor negativeProcessor = new NegativeProcessor();
        ZeroProcessor zeroProcessor = new ZeroProcessor();
        PossitiveProcessor possitiveProcessor = new PossitiveProcessor();
        negativeProcessor.next(zeroProcessor);
        zeroProcessor.next(possitiveProcessor);
        negativeProcessor.process(new Number(20));
        negativeProcessor.process(new Number(0));
        negativeProcessor.process(new Number(-20));
        negativeProcessor.process(new Number(2));
        negativeProcessor.process(new Number(-2));
        negativeProcessor.process(new Number(153));
    }
}
