package com.designPatterns.Decorator;

public class VeggiePizzaDecorator extends PizzaDecorator{
    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        System.out.println("Adding Veggie decoration");
    }
}
