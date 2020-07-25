package com.designPatterns.Command;

import javax.swing.text.html.parser.TagElement;

public class Person {
    public static void main(String arg[]){
        Telivision telivision = new Telivision();
        OnCommand onCommand = new OnCommand(telivision);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();
    }
}
