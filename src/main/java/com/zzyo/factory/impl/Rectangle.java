package com.zzyo.factory.impl;

import com.zzyo.factory.Shap;

public class Rectangle  implements Shap {
    @Override
    public void draw() {
        System.out.println("Rectangle  = " + "Rectangle" );
    }
}
