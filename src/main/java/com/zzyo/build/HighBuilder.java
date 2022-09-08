package com.zzyo.build;
//高级建造者
public class HighBuilder extends AbsBuilder {
    @Override
    void buildPartA() {
        System.out.println("高级计划A");
    }

    @Override
    void buildPartB() {
        System.out.println("高级计划B");
    }

    @Override
    void buildPartC() {
        System.out.println("高级计划C");
    }
}
