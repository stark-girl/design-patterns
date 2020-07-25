package com.designPatterns.Command;

public class OffCommand implements Command{

    Telivision telivision;

    public OffCommand(Telivision telivision) {
        this.telivision = telivision;
    }

    @Override
    public void execute() {
        telivision.off();
    }



}
