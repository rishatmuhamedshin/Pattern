package ru.muhamedshin.RealBook.STRATEGY.ducks;

import ru.muhamedshin.RealBook.STRATEGY.inteface.FlyBehavior;
import ru.muhamedshin.RealBook.STRATEGY.inteface.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public abstract void display();

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }
}
