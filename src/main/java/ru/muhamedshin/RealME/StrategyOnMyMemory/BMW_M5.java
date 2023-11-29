package ru.muhamedshin.RealME.StrategyOnMyMemory;

import ru.muhamedshin.RealME.StrategyOnMyMemory.bodyRealisation.Convertible;
import ru.muhamedshin.RealME.StrategyOnMyMemory.bodyRealisation.Hatchback;
import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.Body;
import ru.muhamedshin.RealME.StrategyOnMyMemory.realisationSoundBeep.SoundBeep1;
import ru.muhamedshin.RealME.StrategyOnMyMemory.realisationSoundBeep.SoundBeep2;

public class BMW_M5 extends Car {
    public BMW_M5() {
        soundBeep = new SoundBeep2();
        body = new Hatchback();
    }


    @Override
    public void openDoor() {
        System.out.println("Open door BMW");
    }

    @Override
    public void drive() {
        System.out.println(" and drive 340 km/h");
    }
}
