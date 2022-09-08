package com.zzyo.singleton;

/**
 * 枚举实现单例 解决线程同步 防止反序列化
 */
public enum SingletoneSix {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println("SingletoneSix.INSTANCE.hashCode() = " + SingletoneSix.INSTANCE.hashCode())).start();
        }
    }

}
