package ru.muhamedshin.RealME.StrategyOnMyMemory;

import ru.muhamedshin.RealME.StrategyOnMyMemory.bodyRealisation.Convertible;
import ru.muhamedshin.RealME.StrategyOnMyMemory.bodyRealisation.Hatchback;
import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.Body;
import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.SoundBeep;
import ru.muhamedshin.RealME.StrategyOnMyMemory.realisationSoundBeep.SoundBeep1;

public class M_B_SL_350 extends Car {
    public M_B_SL_350() {
        soundBeep = new SoundBeep1();
        body = new Convertible();
    }

    @Override
    public void setBody(Body body) {
        super.setBody(body);
    }

    @Override
    public void setSoundBeep(SoundBeep soundBeep) {
        super.setSoundBeep(soundBeep);
    }

    @Override
    public void openDoor() {
        System.out.println("Open door Mercedes");
    }

    @Override
    public void drive() {
        System.out.println(" and drive 350 km/h");
    }
}
