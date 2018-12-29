package com.example.android.designpatterns.BehavioralPatterns.CommandPattern.Light;

/**
 * Created by MateuszW on 2018-04-17.
 */

public class Switch {
    private Command UpCommand, DownCommand;
    public Switch( Command Up, Command Down) {
        UpCommand = Up; // concrete Command registers itself with the invoker
        DownCommand = Down;
    }
    void flipUp( ) { // invoker calls back concrete Command, which executes the Command on the receiver
        UpCommand . execute ( ) ;
    }
    void flipDown( ) {
        DownCommand . execute ( );
    }
}
