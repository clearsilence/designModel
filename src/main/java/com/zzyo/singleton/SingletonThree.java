package com.zzyo.singleton;

/**
 * 懒汉
 * 效率低 还不能完全解决按需初始化实例的问题 ---渣渣
 */
public class SingletonThree {
    private static SingletonThree INSTANCE;

    private SingletonThree() {
    }

    //加锁解决多线程导致创建多实例问题
    public static synchronized SingletonThree getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new SingletonThree();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("SingletonThree.getInstance() = " + SingletonThree.getInstance().hashCode());
                }
            }).start();
        }
    }
}
