package com.zzyo.bridge.Impl;

import com.zzyo.bridge.Brand;
//具体的品牌 华为
public class Huawei implements Brand {
    @Override
    public void pay() {
        System.out.println("huawei电脑");
    }
}
