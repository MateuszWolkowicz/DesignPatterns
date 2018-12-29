package com.example.android.designpatterns.others.ServiceLocatorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
