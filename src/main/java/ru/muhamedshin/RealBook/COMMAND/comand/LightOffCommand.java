package ru.muhamedshin.RealBook.COMMAND.comand;

import ru.muhamedshin.RealBook.COMMAND.Command;
import ru.muhamedshin.RealBook.COMMAND.device.Light;

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
