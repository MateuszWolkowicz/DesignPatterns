package com.example.android.designpatterns.BehavioralPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
