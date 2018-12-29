package com.example.android.designpatterns.StructuralPatterns.AdapterPattern;

import com.example.android.designpatterns.StructuralPatterns.AdapterPattern.Interfaces.AdvancedMediaPlayer;

/**
 * Created by MateuszW on 2018-03-22.
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
