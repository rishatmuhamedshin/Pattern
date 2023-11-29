package ru.muhamedshin.RealBook.COMMAND;

import ru.muhamedshin.RealBook.COMMAND.comand.GarageDoorClosedCommand;
import ru.muhamedshin.RealBook.COMMAND.comand.GarageDoorOpenCommand;
import ru.muhamedshin.RealBook.COMMAND.comand.LightOnCommand;
import ru.muhamedshin.RealBook.COMMAND.device.GarageDoor;
import ru.muhamedshin.RealBook.COMMAND.device.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        GarageDoor garageDoor = new GarageDoor();

        remoteControl.setCommand(0,new GarageDoorOpenCommand(garageDoor),new GarageDoorClosedCommand(garageDoor));


        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
