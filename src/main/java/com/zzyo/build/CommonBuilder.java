package com.zzyo.build;
//普通建造者
public class CommonBuilder extends AbsBuilder{
    @Override
    void buildPartA() {
        System.out.println("普通计划A = " );
    }

    @Override
    void buildPartB() {
        System.out.println("普通计划B = " );
    }

    @Override
    void buildPartC() {
        System.out.println("普通计划C = " );
    }
}
