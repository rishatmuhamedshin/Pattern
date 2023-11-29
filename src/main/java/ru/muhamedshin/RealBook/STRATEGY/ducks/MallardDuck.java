package ru.muhamedshin.RealBook.STRATEGY.ducks;

import ru.muhamedshin.RealBook.STRATEGY.flyRealisation.FlyWithWings;
import ru.muhamedshin.RealBook.STRATEGY.quackRelisation.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}