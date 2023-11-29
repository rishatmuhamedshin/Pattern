package ru.muhamedshin.RealBook.COMMAND.comand;

import ru.muhamedshin.RealBook.COMMAND.Command;
import ru.muhamedshin.RealBook.COMMAND.device.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
