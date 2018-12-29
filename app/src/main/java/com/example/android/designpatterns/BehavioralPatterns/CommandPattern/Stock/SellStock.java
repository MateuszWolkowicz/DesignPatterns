package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Stock;

/**
 * Created by MateuszW on 2018-03-23.
 */

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
