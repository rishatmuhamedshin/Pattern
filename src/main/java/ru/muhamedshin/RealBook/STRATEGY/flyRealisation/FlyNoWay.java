package ru.muhamedshin.RealBook.STRATEGY.flyRealisation;

import ru.muhamedshin.RealBook.STRATEGY.inteface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
