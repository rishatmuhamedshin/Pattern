package ru.muhamedshin.RealME.StrategyOnMyMemory;

import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.Body;
import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.SoundBeep;



public abstract class Car {
    SoundBeep soundBeep;
    Body body;

    public void beep(){
        soundBeep.sound();
    }
    public void soutBody(){
        body.openRoof();
    }


    public void setSoundBeep(SoundBeep soundBeep) {
        this.soundBeep = soundBeep;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public abstract void openDoor();

    public abstract void drive();
}
