package com.designPatterns.templateMethod;

public class LaptopManufacturer extends Manufacturer{

    @Override
    public String addHardDisk() {
        return "Added HardDisk to LAptop";
    }

    @Override
    public String addRAM() {
        return "Added ram to Laptop";
    }

    @Override
    public String addKeyboard() {
        return "Added Keyboard to laptop";
    }
}
