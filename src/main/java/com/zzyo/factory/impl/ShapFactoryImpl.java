package com.zzyo.factory.impl;

import com.zzyo.factory.ShapFactory;
import com.zzyo.factory.Shap;

public class ShapFactoryImpl extends ShapFactory {
    @Override
    protected Shap getShap(String type) {
        Shap shap = null;
        if (type.equals("rectangle")) {
            shap = new Rectangle();

        } else if (type.equals("square")) {
            shap = new Square();
        }
        return shap;
    }
}
