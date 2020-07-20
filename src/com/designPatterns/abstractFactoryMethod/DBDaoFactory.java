package com.designPatterns.abstractFactoryMethod;

public class DBDaoFactory extends DaoAbstractFactory{
    @Override
    public  Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("dept")){
            dao = new DBDeptDao();
        }else if(type.equals("emp")){
            dao = new DBEmpDao();
        }

        return dao;
    }
}
