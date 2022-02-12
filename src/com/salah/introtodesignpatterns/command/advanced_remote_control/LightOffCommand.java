package com.salah.introtodesignpatterns.command.advanced_remote_control;

import com.salah.introtodesignpatterns.command.simple_remote_control.Command;
import com.salah.introtodesignpatterns.command.simple_remote_control.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
