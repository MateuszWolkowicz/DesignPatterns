package com.example.android.designpatterns.CreationalPatterns.SingletonPattern.ThreadSafe.Eager;

/**
 * Created by MateuszW on 2018-03-21.
 */

public class SingletonEagerThreadSafe {
    private  static SingletonEagerThreadSafe instance = new SingletonEagerThreadSafe();

    private SingletonEagerThreadSafe(){}

    public static SingletonEagerThreadSafe getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World Singleton!");
    }



}
