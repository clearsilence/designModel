package com.zzyo.strategy.impl;

import com.zzyo.strategy.RedmiPhone;

public class TwoMan implements RedmiPhone {
    @Override
    public void playSheep(String phoneName) {
        System.out.println("phoneName paly sheep = " + phoneName);
    }

    @Override
    public void playPig(String phoneName) {

    }
}
