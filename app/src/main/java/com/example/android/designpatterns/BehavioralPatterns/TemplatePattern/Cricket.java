package com.example.android.designpatterns.BehavioralPatterns.TemplatePattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public class Cricket  extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}