package com.designPatterns.abstractFactoryMethod;

public class AbstractFactoryMethodTest {
    public static void main(String arg[]){
        DaoAbstractFactory def = DaoFactoryProducer.produce("xml");
        Dao d = def.createDao("emp");
        d.save();

    }
}
