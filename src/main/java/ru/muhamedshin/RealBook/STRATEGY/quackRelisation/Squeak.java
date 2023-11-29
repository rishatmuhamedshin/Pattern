package ru.muhamedshin.RealBook.STRATEGY.quackRelisation;

import ru.muhamedshin.RealBook.STRATEGY.inteface.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
