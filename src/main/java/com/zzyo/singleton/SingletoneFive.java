package com.zzyo.singleton;

/**
 * 内部内解决引用类即创建实例问题
 * 实现懒加载
 * 虚拟机保证线程安全 一个类只加载一次
 */
public class SingletoneFive {
    private static SingletoneFive INSTANCE;

    private SingletoneFive() {
    }

    private static class SingletoneFiveHold {
        private static final SingletoneFive INSTANCEHOLD = new SingletoneFive();
    }

    public static SingletoneFive getInstance() {
        return SingletoneFiveHold.INSTANCEHOLD;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( () -> System.out.println("SingletoneFive.getInstance().hashCode() = " + SingletoneFive.getInstance().hashCode())).start();
        }
    }
}
