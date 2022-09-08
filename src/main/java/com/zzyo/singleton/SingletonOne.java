package com.zzyo.singleton;

/**
 * 饿汉单例模式 实际使用最多
 */
public class SingletonOne {
    //两种选一即可
    //private static final SingletonOne INSTANCE = new SingletonOne();
    private static final SingletonOne INSTANCE;

    static {
        INSTANCE = new SingletonOne();
    }

    private SingletonOne() {
    }

    private static SingletonOne getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("SingletonOne.getInstance() = " + SingletonOne.getInstance().hashCode());
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(SingletonOne.getInstance().hashCode())).start();
        }

    }
}
