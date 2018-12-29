package com.example.android.designpatterns.BehavioralPatterns.TemplatePattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
