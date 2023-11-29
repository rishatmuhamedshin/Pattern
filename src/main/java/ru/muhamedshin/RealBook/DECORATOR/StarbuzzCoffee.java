package ru.muhamedshin.RealBook.DECORATOR;

import ru.muhamedshin.RealBook.DECORATOR.decor.Mocha;
import ru.muhamedshin.RealBook.DECORATOR.decor.Soy;
import ru.muhamedshin.RealBook.DECORATOR.decor.Whip;
import ru.muhamedshin.RealBook.DECORATOR.drink.DarkRoast;
import ru.muhamedshin.RealBook.DECORATOR.drink.Espresso;
import ru.muhamedshin.RealBook.DECORATOR.drink.HouseBlend;

import java.io.FilterInputStream;
import java.io.InputStream;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast(Beverage.Size.TALL);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage3 = new HouseBlend(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());

    }
}

