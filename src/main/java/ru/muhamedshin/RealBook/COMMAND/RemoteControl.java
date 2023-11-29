package ru.muhamedshin.RealBook.COMMAND;

import ru.muhamedshin.RealBook.COMMAND.comand.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoOperation;

    public RemoteControl() {
        offCommands = new Command[7];
        onCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoOperation = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoOperation = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoOperation = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoOperation.undo();
    }

    public String toString() {
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuild.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuild.toString();
    }
}
