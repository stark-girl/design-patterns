package com.designPatterns.flyweight;

public class Rectangle extends Shape{

    private String label;
    private int length;
    private int breadth;
    String fillStyle;

    public Rectangle(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public void draw(int length, int breadth,String fillStyle){
       System.out.println("Rectangle{" +
                "label='" + label + '\'' +
                ", length=" + length +
                ", breadth=" + breadth +
                ", fillStyle='" + fillStyle + '\'' +
                '}');
    }
}
