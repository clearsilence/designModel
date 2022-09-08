package com.zzyo.strategy.impl;

import com.zzyo.strategy.ApplePhone;

public class OneMan implements ApplePhone {
    OneManAdapter mAdapter;
    @Override
    public void playSheep(String phoneType, String phoneName) {
        if (phoneType.equalsIgnoreCase("phone")) {
            mAdapter = new OneManAdapter(phoneType);
            mAdapter.playSheep(phoneType, phoneName);
        }
    }
}
