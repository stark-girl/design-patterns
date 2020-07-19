package com.designPatterns.Factory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting Cheese Pizza");
    }
}
