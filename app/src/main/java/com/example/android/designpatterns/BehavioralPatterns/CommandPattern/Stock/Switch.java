package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Stock;

/**
 * Created by MateuszW on 2018-04-17.
 */

public class Switch {
    private Order UpOrder, DownOrder;
    public Switch(Order Up, Order Down) {
        UpOrder = Up; // concrete Order registers itself with the invoker
        DownOrder = Down;
    }
    void flipUp( ) { // invoker calls back concrete Order, which executes the Order on the receiver
        UpOrder . execute ( ) ;
    }
    void flipDown( ) {
        DownOrder . execute ( );
    }
}
