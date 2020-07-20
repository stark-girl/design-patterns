package com.designPatterns.abstractFactoryMethod;

public class XMLEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving Employee to XML");
    }
}