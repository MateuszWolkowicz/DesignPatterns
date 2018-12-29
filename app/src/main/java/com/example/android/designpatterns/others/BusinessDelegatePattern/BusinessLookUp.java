package com.example.android.designpatterns.others.BusinessDelegatePattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){

        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else {
            return new JMSService();
        }
    }
}
