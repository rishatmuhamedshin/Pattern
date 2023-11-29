package ru.muhamedshin.RealME.StrategyOnMyMemory.bodyRealisation;

import ru.muhamedshin.RealME.StrategyOnMyMemory.interfaces.Body;

public class Convertible implements Body {

    @Override
    public void openRoof() {
        System.out.println("it doesn't open");
    }
}