package com.designPatterns.templateMethod;

public class DesktopManufacturer extends Manufacturer{
    @Override
    public String addHardDisk() {
        return "Added HardDisk to Desktop";
    }

    @Override
    public String addRAM() {
        return "Added RAM to Desktop";
    }

    @Override
    public String addKeyboard() {
        return "Added keyboard to Desktop";
    }
}
