package com.zzyo.bridge.Impl;

import com.zzyo.bridge.Brand;
import com.zzyo.bridge.Computer;

//具体的电脑类型 台式机
public class Deskbook extends Computer {

    public Deskbook(Brand brand) {
        super(brand);
    }

    @Override
    public void pay() {
        super.pay();
        System.out.println("台式的");
    }
}
