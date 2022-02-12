package com.salah.introtodesignpatterns.command.advanced_remote_control;

import com.salah.introtodesignpatterns.command.simple_remote_control.*;

public class MacroMainTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen Room");
        LightOnCommand livingLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        remoteControl.setCommand(0, livingLightOnCommand, livingLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, garageDoorUpCommand, garageDoorDownCommand);


        Command[] onCommands = {livingLightOnCommand, kitchenLightOnCommand, garageDoorUpCommand};
        Command[] offCommands = {livingLightOffCommand, kitchenLightOffCommand, garageDoorDownCommand};

        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0, onMacroCommand, offMacroCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
    }
}
