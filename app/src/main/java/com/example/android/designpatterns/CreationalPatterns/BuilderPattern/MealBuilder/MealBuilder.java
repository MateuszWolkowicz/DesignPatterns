package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder;

import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Burger.ChickenBurger;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Burger.VegBurger;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Drink.Coke;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Drink.Pepsi;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return  meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return  meal;
    }

}
