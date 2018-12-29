package com.example.android.designpatterns.StructuralPatterns.DecoratorPattern.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
