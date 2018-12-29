package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Drink;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }


    @Override
    public float price() {
        return 35.0f;
    }
}
