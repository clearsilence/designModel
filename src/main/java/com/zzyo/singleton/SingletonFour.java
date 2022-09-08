package com.zzyo.singleton;

/**
 * 懒汉
 * 用锁 效率较低 不能避免反序列化
 */
public class SingletonFour {
    private static volatile SingletonFour INSTANCE;//JIT 指定重排

    private SingletonFour() {
    }

    private static SingletonFour getInstance() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //第一次判断过滤为空的实例
        if (INSTANCE == null) {
            //加锁
            synchronized (SingletonFour.class) {
                //第二次判断确保创建一个实例
                if (INSTANCE == null) {
                    INSTANCE = new SingletonFour();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println("SingletonFour.getInstance().hashCode() = " + SingletonFour.getInstance().hashCode())).start();
        }
    }
}
