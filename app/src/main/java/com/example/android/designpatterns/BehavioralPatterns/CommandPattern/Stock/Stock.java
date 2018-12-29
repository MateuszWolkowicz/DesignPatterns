package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Stock;

import android.util.Log;

/**
 * Created by MateuszW on 2018-03-23.
 */

public class Stock {

    private String name ="ABC";
    private int quantity = 10;

    public void buy() {
        Log.d("Stock", "Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        Log.d("Stock", "Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }


}
