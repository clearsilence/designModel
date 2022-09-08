package com.zzyo.factory.impl;

import com.zzyo.factory.Shap;

public class Square implements Shap {
    @Override
    public void draw() {
        System.out.println("Square  = " + "Square" );
    }
}
