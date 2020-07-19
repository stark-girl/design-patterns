package com.designPatterns.Factory;

public class TestFactoryMethodClass {
    public static  void main(String  args[]){
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.order("Cheese");
    }
}
