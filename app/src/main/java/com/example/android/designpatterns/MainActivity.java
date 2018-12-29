package com.example.android.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;
import com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.FactoryProducer;
import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.Shape;
import com.example.android.designpatterns.CreationalPatterns.FactoryPattern.Standard.ShapeFactory;
import com.example.android.designpatterns.CreationalPatterns.SingletonPattern.ThreadSafe.Eager.SingletonEagerThreadSafe;
import com.example.android.designpatterns.BehavioralPatterns.StrategyPattern.Math.StrategyPatternMathDemo;

/**
 * Created by MateuszW on 2017-11-22.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LightDemo.LoadLightDemo();
//        CommandPatternDemo.LoadCommandPattern();
//        FactoryPatternDemo();
        StrategyPatternMathDemo.LoadStrategyPatternDemo();

    }

    public void FactoryPatternDemo() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }

    public void AbstractFactoryPattern() {

        AbstractFactory abstractShapeFactory = FactoryProducer.getFactory("SHAPE");

        com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Shape shape1 = abstractShapeFactory.getShape("CIRCLE");

        shape1.draw();

        AbstractFactory abstractColorFactory = FactoryProducer.getFactory("COLOR");

        com.example.android.designpatterns.CreationalPatterns.AbstractFactoryPattern.Color color1 = abstractColorFactory.getColor("RED");

        color1.fill();

    }

    public void SingletonPattern() {

        // error
        //  SingletonEagerThreadSafe object = new SingletonEagerThreadSafe();

        SingletonEagerThreadSafe object1 = SingletonEagerThreadSafe.getInstance();

        object1.showMessage();


    }

}
