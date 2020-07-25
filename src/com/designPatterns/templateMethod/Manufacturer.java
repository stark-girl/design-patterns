package com.designPatterns.templateMethod;

public abstract class Manufacturer {
    public void buildComputer(){
        String addedHardDisk= addHardDisk();
        System.out.println(addedHardDisk);
        String addedRam= addRAM();
        System.out.println(addedRam);
        String addedKeyboard= addKeyboard();
        System.out.println(addedKeyboard);

    }
    public abstract String addHardDisk();
    public abstract String addRAM();
    public abstract String addKeyboard();
}
