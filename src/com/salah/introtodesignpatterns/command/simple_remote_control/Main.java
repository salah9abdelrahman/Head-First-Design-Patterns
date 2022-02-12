package com.salah.introtodesignpatterns.command.simple_remote_control;
/**
 * Client
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        simpleRemoteControl.setCommand(garageDoorUpCommand);
        simpleRemoteControl.buttonWasPressed();

    }
}
