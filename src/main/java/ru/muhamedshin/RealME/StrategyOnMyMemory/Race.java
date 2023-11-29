package ru.muhamedshin.RealME.StrategyOnMyMemory;

import ru.muhamedshin.RealME.StrategyOnMyMemory.realisationSoundBeep.SoundBeep1;
import ru.muhamedshin.RealME.StrategyOnMyMemory.realisationSoundBeep.SoundBeep2;

public class Race {
    public static void main(String[] args) {
        Car mercedes = new M_B_SL_350();
        mercedes.openDoor();
        mercedes.drive();
        mercedes.beep();


        mercedes.setSoundBeep(new SoundBeep2());

        mercedes.beep();



    }
}
