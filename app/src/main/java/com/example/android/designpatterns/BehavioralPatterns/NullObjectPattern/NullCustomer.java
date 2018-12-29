package com.example.android.designpatterns.BehavioralPatterns.NullObjectPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
