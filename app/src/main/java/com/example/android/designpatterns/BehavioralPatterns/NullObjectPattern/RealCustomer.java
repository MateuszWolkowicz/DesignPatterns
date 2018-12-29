package com.example.android.designpatterns.BehavioralPatterns.NullObjectPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class RealCustomer  extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
