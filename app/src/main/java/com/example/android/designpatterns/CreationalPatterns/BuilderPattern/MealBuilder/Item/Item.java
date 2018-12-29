package com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.Item;

import com.example.android.designpatterns.CreationalPatterns.BuilderPattern.MealBuilder.packing.Packing;

/**
 * Created by MateuszW on 2018-03-21.
 */

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
