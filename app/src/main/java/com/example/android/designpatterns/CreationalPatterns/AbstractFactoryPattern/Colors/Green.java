package com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Colors;

import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Color;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
