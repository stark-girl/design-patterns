package com.designPatterns.Decorator;

public class PlainPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baling Plain Pizza");
    }
}
