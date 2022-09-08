package com.zzyo.build;
//构建者 装修工人
public class Director {
    private AbsBuilder absBuilder;

    //构建
    public Director(AbsBuilder absBuilder) {
        this.absBuilder = absBuilder;
    }

    //产品组装与构建
    public House construct() {
        absBuilder.buildPartA();
        absBuilder.buildPartB();
        absBuilder.buildPartC();
        return absBuilder.getResult();

    }
}
