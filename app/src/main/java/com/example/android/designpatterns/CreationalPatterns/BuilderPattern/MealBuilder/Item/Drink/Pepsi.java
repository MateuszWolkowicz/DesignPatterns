package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Drink;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
