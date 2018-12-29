package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Stock;

/**
 * Created by MateuszW on 2018-03-23.
 */

public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
