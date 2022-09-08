package com.zzyo.bridge.Impl;

import com.zzyo.bridge.Brand;
import com.zzyo.bridge.Computer;
//具体的电脑类型 笔记本
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void pay() {
        super.pay();
        System.out.println("笔记本");
    }
}
