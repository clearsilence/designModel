package com.zzyo.bridge;

//电脑类型抽象类
public abstract class Computer {
    //通过组合的方式架桥,用于连接品牌
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    //自带品牌
    public void pay() {
        brand.pay();
    }
}
