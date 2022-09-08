package com.zzyo.build;

//抽象建造者
public abstract class AbsBuilder {
    abstract void buildPartA();

    abstract void buildPartB();

    abstract void buildPartC();

    House getResult(){
        return new House();
    }
}
