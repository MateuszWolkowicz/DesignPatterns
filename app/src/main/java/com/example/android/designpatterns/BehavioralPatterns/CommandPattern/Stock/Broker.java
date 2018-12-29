package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MateuszW on 2018-03-23.
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public  void placeOrders(){
        for (Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }

}
