package com.zzyo.factory;

import com.zzyo.factory.impl.ShapFactoryImpl;

public class ProductFactory {
    public static ShapFactory getFactory(String product) {

        if (product.equalsIgnoreCase("shap")) {
            return new ShapFactoryImpl();
        } else if (product.equalsIgnoreCase("cloler")) {
            return null;
        }
        return null;
    }
}
