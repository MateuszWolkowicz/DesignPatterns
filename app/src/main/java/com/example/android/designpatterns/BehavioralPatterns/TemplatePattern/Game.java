package com.example.android.designpatterns.BehavioralPatterns.TemplatePattern;

/**
 * Created by MateuszW on 2018-04-19.
 */

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
