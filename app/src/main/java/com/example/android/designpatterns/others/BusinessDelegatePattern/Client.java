package com.example.android.designpatterns.others.BusinessDelegatePattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
