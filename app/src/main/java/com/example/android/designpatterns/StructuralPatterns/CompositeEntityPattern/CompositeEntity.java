package com.example.android.designpatterns.StructuralPatterns.CompositeEntityPattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}