package ru.muhamedshin.RealBook.STRATEGY.ducks;

import ru.muhamedshin.RealBook.STRATEGY.flyRealisation.FlyNoWay;
import ru.muhamedshin.RealBook.STRATEGY.inteface.FlyBehavior;
import ru.muhamedshin.RealBook.STRATEGY.inteface.QuackBehavior;
import ru.muhamedshin.RealBook.STRATEGY.quackRelisation.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    };
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    };

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
