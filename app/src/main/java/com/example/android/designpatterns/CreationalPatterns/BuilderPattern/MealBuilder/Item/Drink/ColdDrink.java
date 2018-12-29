package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Drink;

import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Item;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing.Bottle;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing.Packing;

/**
 * Created by MateuszW on 2018-03-21.
 */

public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();



}
