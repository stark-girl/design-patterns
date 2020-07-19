package com.designPatterns.Factory;

public class PizzaFactory {
    private static Pizza p = null;

    public static Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            p = new CheesePizza();
        } else if (type.equals("Chicken")) {
            p = new CheesePizza();
        } else if (type.equals("Veggie")) {
            p = new CheesePizza();
        }
        return p;
    }
}
