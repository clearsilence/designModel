package com.zzyo.bridge.Impl;

import com.zzyo.bridge.Brand;
//具体的品牌 小米
public class Xiaomi implements Brand {
    @Override
    public void pay() {
        System.out.println("小米电脑" );
    }
}
