package com.example.android.designpatterns.StructuralPatterns.AdapterPattern;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class AdapterPatternDemo {

    public void LoadAdapterPatternDemo() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","test.mp3");
        audioPlayer.play("mp4","test.mp4");
        audioPlayer.play("vlc","test.vlc");
        audioPlayer.play("avi","test.avi");
    }

}
