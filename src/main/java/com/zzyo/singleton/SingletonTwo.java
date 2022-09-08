package com.zzyo.singleton;

/**
 * 懒汉单例模式
 * 多线程会导致创建多个实例
 */
public class SingletonTwo {
    private static SingletonTwo INSTANCE;

    private SingletonTwo() {
    }

    public static SingletonTwo getInstance() {
        if (INSTANCE == null) {
            try {
                //测试多线程问题睡一会
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new SingletonTwo();
        }
        return INSTANCE;
    }

    //测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println("SingletonTwo.getInstance().hashCode() = " + SingletonTwo.getInstance().hashCode())).start();
        }
    }
}
