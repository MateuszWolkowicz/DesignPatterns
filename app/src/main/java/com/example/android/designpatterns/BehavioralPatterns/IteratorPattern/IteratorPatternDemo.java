package com.example.android.designpatterns.BehavioralPatterns.IteratorPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
