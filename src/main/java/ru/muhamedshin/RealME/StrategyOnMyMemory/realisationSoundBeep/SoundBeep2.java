package ru.muhamedshin.RealME.StrategyOnMyMemory.realisationSoundBeep;

import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.SoundBeep;

public class SoundBeep2 implements SoundBeep {
    @Override
    public void sound() {
        System.out.println("Beeep-beeep");
    }
}
