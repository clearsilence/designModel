package com.zzyo.adapter.Impl;

import com.zzyo.adapter.Voltage220V;
import com.zzyo.adapter.Voltage5V;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 1、类适配器 继承
 * 2、对象适配器聚合调用
 * 3、接口适配器 抽象类空实现接口，具体类通过匿名内部类重写具体需要方法
 */
public class PowerTrans implements Voltage5V {
    @Autowired
    private Voltage220V voltage220V;

    @Override
    public int getVoltage5V() {
        //220V 转换为5v
        return voltage220V.getVoltage220V() / 44;
    }
}
