package ru.muhamedshin.RealBook.DECORATOR.drink;

import ru.muhamedshin.RealBook.DECORATOR.Beverage;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        setDescription("Espresso");
        setSize(size);
    }

    @Override
    public double cost() {
        double result = 0;
        switch (getSize()) {
            case TALL -> result = .99;
            case VENTI -> result = .30;
            case GRANDE -> result = .4;
        }

        return result;
    }


}
