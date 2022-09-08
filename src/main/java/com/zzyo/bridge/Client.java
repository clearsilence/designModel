package com.zzyo.bridge;

import com.zzyo.bridge.Impl.Deskbook;
import com.zzyo.bridge.Impl.Huawei;
import com.zzyo.bridge.Impl.Laptop;
import com.zzyo.bridge.Impl.Xiaomi;
//测试客户端
public class Client {
    public static void main(String[] args) {
        //华为台式机
        Deskbook deskbook = new Deskbook(new Huawei());
        deskbook.pay();

        //小米笔记本
        Laptop laptop = new Laptop(new Xiaomi());
        laptop.pay();

    }
}
