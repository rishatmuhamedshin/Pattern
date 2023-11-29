package ru.muhamedshin.RealBook.STRATEGY.flyRealisation;

import ru.muhamedshin.RealBook.STRATEGY.inteface.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
