package ru.muhamedshin.RealBook.COMMAND.comand;

import ru.muhamedshin.RealBook.COMMAND.Command;
import ru.muhamedshin.RealBook.COMMAND.device.GarageDoor;

public class GarageDoorClosedCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorClosedCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.closed();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
