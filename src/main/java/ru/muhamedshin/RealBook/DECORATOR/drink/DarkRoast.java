package ru.muhamedshin.RealBook.DECORATOR.drink;

import ru.muhamedshin.RealBook.DECORATOR.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        setDescription("DarkRoast");
        setSize(size);
    }

    @Override
    public double cost() {
        double result = 0;
        switch (getSize()) {
            case TALL -> result = .69;
            case VENTI -> result = .80;
            case GRANDE -> result = .94;
        }

        return result;
    }
}
