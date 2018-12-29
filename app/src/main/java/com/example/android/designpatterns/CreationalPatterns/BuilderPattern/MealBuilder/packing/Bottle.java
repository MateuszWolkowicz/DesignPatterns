package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
