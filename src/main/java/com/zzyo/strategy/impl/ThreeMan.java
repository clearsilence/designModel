package com.zzyo.strategy.impl;

import com.zzyo.strategy.RedmiPhone;

public class ThreeMan implements RedmiPhone {
    @Override
    public void playSheep(String phoneName) {

    }

    @Override
    public void playPig(String phoneName) {
        System.out.println("phoneName playPig " + phoneName);
    }
}
