package com.designPatterns.Factory;

public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking Chicken Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting Chicken Pizza");
    }
}
