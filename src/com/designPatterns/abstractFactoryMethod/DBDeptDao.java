package com.designPatterns.abstractFactoryMethod;

public class DBDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving Dept to DB");
    }
}
