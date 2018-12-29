package com.example.android.designpatterns.BehavioralPatterns.MediatorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
