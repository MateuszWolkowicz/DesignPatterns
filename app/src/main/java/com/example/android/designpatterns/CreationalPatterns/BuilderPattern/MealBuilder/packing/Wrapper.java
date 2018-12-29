package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
