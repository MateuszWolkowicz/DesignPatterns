package com.example.android.designpatterns.StructuralPatterns.AdapterPattern;

import com.example.android.designpatterns.StructuralPatterns.AdapterPattern.Interfaces.AdvancedMediaPlayer;
import com.example.android.designpatterns.StructuralPatterns.AdapterPattern.Interfaces.MediaPlayer;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
