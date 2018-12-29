package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Stock;

/**
 * Created by MateuszW on 2018-03-23.
 */

public class CommandPatternDemo {

    public static void LoadCommandPattern() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        //switcher
        Switch testSwitch = new Switch( buyStockOrder,sellStockOrder);
        //switch buy
        testSwitch.flipUp( );
        //switch sell
        testSwitch.flipDown( );

    }
}
