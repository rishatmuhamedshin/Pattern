package ru.muhamedshin.RealBook.STRATEGY.flyRealisation;

import ru.muhamedshin.RealBook.STRATEGY.inteface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}

