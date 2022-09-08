package com.zzyo.build;

//测试客户端
public class Clien {
    public static void main(String[] args) {
        CommonBuilder commonBuilder = new CommonBuilder();
        Director director = new Director(commonBuilder);
        director.construct();

        HighBuilder highBuilder = new HighBuilder();
        Director director1 = new Director(highBuilder);
        director1.construct();
    }
}
