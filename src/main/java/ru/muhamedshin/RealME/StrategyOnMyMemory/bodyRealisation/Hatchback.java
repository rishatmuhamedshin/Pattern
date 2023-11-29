package ru.muhamedshin.RealME.StrategyOnMyMemory.bodyRealisation;

import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.Body;

public class Hatchback implements Body {

    @Override
    public void openRoof() {
        System.out.println("Open roof");
    }
}
