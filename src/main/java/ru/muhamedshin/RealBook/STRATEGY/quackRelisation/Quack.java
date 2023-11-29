package ru.muhamedshin.RealBook.STRATEGY.quackRelisation;

import ru.muhamedshin.RealBook.STRATEGY.inteface.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

