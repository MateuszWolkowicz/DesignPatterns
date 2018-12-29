package com.example.android.designpatterns.others.BusinessDelegatePattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class JMSService  implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
