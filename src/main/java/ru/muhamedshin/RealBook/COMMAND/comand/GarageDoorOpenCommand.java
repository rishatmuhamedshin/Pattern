package ru.muhamedshin.RealBook.COMMAND.comand;

import ru.muhamedshin.RealBook.COMMAND.Command;
import ru.muhamedshin.RealBook.COMMAND.device.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.closed();
    }
}
