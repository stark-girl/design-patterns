package com.designPatterns.flyweight;

public class Circle  extends Shape{
    private String label;
    private int radius;
    private String fillcolor;
    private String linecolor;

    public Circle(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getFillcolor() {
        return fillcolor;
    }

    public void setFillcolor(String fillcolor) {
        this.fillcolor = fillcolor;
    }

    public String getLinecolor() {
        return linecolor;
    }

    public void setLinecolor(String linecolor) {
        this.linecolor = linecolor;
    }

    @Override
    public void draw(int radius, String fllcolor,String linecolor) {
        System.out.println( "Circle{" +
                "label='" + label + '\'' +
                ", radius=" + radius +
                ", fillcolor='" + fllcolor + '\'' +
                ", linecolor='" + linecolor + '\'' +
                '}');
    }
}
