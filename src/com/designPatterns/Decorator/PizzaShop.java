package com.designPatterns.Decorator;

public class PizzaShop {


    public static  void  main(String arg[]){
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}
