package com.designPatterns.Factory;

public class PersonFactory {
    private static Person p =null;
    public static Person getPerson(String gender){
        if(gender.equals("Male")){
            p = new Male();
        }else if(gender.equals("Female")){
            p = new Female();
        }
        return p;
    }
}
