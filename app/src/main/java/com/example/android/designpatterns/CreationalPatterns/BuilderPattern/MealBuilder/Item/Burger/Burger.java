package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Burger;

import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item.Item;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing.Packing;
import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing.Wrapper;

/**
 * Created by MateuszW on 2018-03-21.
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
