package com.zzyo.strategy.impl;

import com.zzyo.strategy.ApplePhone;
import com.zzyo.strategy.RedmiPhone;

public class OneManAdapter  implements ApplePhone {
    RedmiPhone phone;

    public OneManAdapter(String phoneType) {
        if (phoneType.equalsIgnoreCase("redmi")) {
            phone = new TwoMan();
        } else if (phoneType.equalsIgnoreCase("apple")) {
            phone = new ThreeMan();
        }
    }

    @Override
    public void playSheep(String phoneType, String phoneName) {
        if (phoneType.equalsIgnoreCase("apple")) {
            phone.playSheep(phoneName);
        } else if (phoneType.equalsIgnoreCase("redmi")) {
            phone.playPig(phoneName);
        }
    }
}
