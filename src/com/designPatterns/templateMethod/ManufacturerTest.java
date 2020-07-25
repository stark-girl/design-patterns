package com.designPatterns.templateMethod;

public class ManufacturerTest {
    public static void main(String arg[]){
        Manufacturer manufacturer= new LaptopManufacturer();
        manufacturer.buildComputer();
    }
}
