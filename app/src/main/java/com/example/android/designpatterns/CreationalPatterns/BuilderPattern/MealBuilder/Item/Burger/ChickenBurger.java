package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Burger;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
