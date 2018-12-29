package com.example.android.designpatterns.CreationalPatterns.SingletonPattern.ThreadSafe.Lazy;

public class SingletonLazyThreadSafe {

    private  static volatile SingletonLazyThreadSafe instance ;

    private SingletonLazyThreadSafe(){}

    public static SingletonLazyThreadSafe getInstance(){
        if (instance == null) {
            synchronized (SingletonLazyThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonLazyThreadSafe();
                }
            }
        }
        return instance;

    }

    public void showMessage(){
        System.out.println("Hello World Singleton!");
    }



}
