package com.designPatterns.Factory;

public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting Veggie Pizza");
    }

}
