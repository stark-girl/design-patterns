package com.designPatterns.Factory;

public class PizzaStore {
    Pizza p=null;
    public Pizza order(String type){
      p= PizzaFactory.createPizza(type);
      p.prepare();
      p.bake();
      p.cut();

      return p;

    }
}
