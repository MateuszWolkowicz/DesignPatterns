package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Burger;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class VegBurger extends Burger {


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
