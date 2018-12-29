package com.example.android.designpatterns.StructuralPatterns.AdapterPattern;

import com.example.android.designpatterns.StructuralPatterns.AdapterPattern.Interfaces.AdvancedMediaPlayer;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
