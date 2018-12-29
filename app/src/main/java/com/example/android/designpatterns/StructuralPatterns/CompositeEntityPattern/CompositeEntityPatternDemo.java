package com.example.android.designpatterns.StructuralPatterns.CompositeEntityPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
