package com.designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String type){

        Shape shape = null;
        if(shapes.get(type)!=null){
            shape =shapes.get(type);
        }else{
            if(type.equals("Circle")){
                shape= new Circle("circle");
            }else if (type.equals("rectangle")){
                shape= new Rectangle("rectangle");
            }
            shapes.put(type,shape);
        }
         return shape;

    }
}
