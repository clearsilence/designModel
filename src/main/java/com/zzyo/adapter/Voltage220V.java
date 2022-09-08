package com.zzyo.adapter;

import javax.annotation.Resource;

//220V充电
@Resource
public class Voltage220V {
    public int getVoltage220V() {
        System.out.println("220V充电 ");
        return 220;
    }
}
