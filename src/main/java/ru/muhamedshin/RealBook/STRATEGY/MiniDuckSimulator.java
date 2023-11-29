package ru.muhamedshin.RealBook.STRATEGY;

import ru.muhamedshin.RealBook.STRATEGY.ducks.Duck;
import ru.muhamedshin.RealBook.STRATEGY.ducks.MallardDuck;
import ru.muhamedshin.RealBook.STRATEGY.ducks.ModelDuck;
import ru.muhamedshin.RealBook.STRATEGY.flyRealisation.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        ModelDuck model = new ModelDuck();

        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
