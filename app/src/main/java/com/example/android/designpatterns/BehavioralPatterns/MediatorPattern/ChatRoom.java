package com.example.android.designpatterns.BehavioralPatterns.MediatorPattern;

import java.util.Date;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
