package com.example.android.designpatterns.others.ServiceLocatorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class InitialContext {
    public Object lookup(String jndiName){

        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }
        else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
