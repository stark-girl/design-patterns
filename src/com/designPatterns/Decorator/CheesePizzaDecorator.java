package com.designPatterns.Decorator;

public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    public void bake(){
        super.bake();
        System.out.println("Adding Cheese decoration");
    }
}
