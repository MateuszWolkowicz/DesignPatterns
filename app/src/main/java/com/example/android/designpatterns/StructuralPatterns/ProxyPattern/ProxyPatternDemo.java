package com.example.android.designpatterns.StructuralPatterns.ProxyPattern;

/**
 * Created by MateuszW on 2018-04-18.
 */

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
