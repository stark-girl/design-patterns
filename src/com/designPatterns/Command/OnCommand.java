package com.designPatterns.Command;

public class OnCommand implements Command{

    Telivision telivision;

    public OnCommand(Telivision telivision) {
        this.telivision = telivision;
    }

    @Override
    public void execute() {
        telivision.on();
    }
}
