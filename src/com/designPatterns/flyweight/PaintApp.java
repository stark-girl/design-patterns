package com.designPatterns.flyweight;

public class PaintApp {

    public void render(int noOfShapes){
        Shape shape = null;
        for(int i=0;i<noOfShapes;i++){
            if(i%2==0){
                shape = ShapeFactory.getShape("Circle");
                shape.draw(i,"red","white");
            }else{
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i,i+1,"dotted");
            }
        }
    }
}
