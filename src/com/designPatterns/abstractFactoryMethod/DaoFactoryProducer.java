package com.designPatterns.abstractFactoryMethod;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce (String factoryType){
        DaoAbstractFactory def= null;
        if(factoryType.equals("xml")){
            def= new XMLDaoFactory();
        }else if(factoryType.equals("db")){
            def = new DBDaoFactory();
        }
        return def;
    }
}
