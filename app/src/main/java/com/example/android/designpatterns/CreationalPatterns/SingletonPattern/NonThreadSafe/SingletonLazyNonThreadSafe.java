package com.example.android.designpatterns.CreationalPatterns.SingletonPattern.NonThreadSafe;

import com.example.android.designpatterns.CreationalPatterns.SingletonPattern.ThreadSafe.Lazy.SingletonLazyThreadSafe;

public class SingletonLazyNonThreadSafe {

    private  static  SingletonLazyNonThreadSafe instance ;

    private SingletonLazyNonThreadSafe(){}

    public static SingletonLazyNonThreadSafe getInstance(){
                if (instance == null) {
                    instance = new SingletonLazyNonThreadSafe();
                }
        return instance;

    }

    public void showMessage(){
        System.out.println("Hello World Singleton!");
    }

}
