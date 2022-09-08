package com.zzyo.factory;

public class Test {
    public static void main(String[] args) {
        ShapFactory shap = ProductFactory.getFactory("shap");
        Shap rectangle = shap.getShap("rectangle");
        rectangle.draw();

        System.out.println("shap = " + shap);
    }
}
