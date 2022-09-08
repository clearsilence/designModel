package com.zzyo.adapter;

import com.zzyo.adapter.Impl.PowerTrans;
//经过适配器处理 将 220v转换为5v
//适配器模式可以理解为在原有类的基础上套了一层壳，用户访问这个壳中名称相同的接口，即可进行访问
public class Client {
    public static void main(String[] args) {
        PowerTrans powerTrans = new PowerTrans();
        int voltage5V = powerTrans.getVoltage5V();
        System.out.println("适配后充电 voltage5V = " + voltage5V);
    }
}
