package com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math;

import com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math.Context;
import com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math.OperationAdd;
import com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math.OperationMultiply;
import com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math.OperationSubstract;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class StrategyPatternMathDemo {


    public static void LoadStrategyPatternDemo() {
        int num1 = 10;
        int num2 = 5;

        // one by one

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(num1, num2));

        // all in one

        Context contextAll = new Context();
        contextAll.addStrategy(new OperationAdd());
        contextAll.addStrategy(new OperationSubstract());
        contextAll.addStrategy(new OperationMultiply());
        contextAll.executeStrategyAll(num1,num2);

    }

}
