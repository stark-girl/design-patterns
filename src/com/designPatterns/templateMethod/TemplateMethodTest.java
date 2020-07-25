package com.designPatterns.templateMethod;

public class TemplateMethodTest {
    public static void main(String arg[]){
        DataRenderer dr = new XMLDataRenderer();
        dr.renderer();

    }
}
