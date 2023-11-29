package ru.muhamedshin.RealBook.DECORATOR.drink;

import ru.muhamedshin.RealBook.DECORATOR.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        setDescription("House Blend Coffee");
        setSize(size);
    }

    @Override
    public double cost() {
        double result = 0;
        switch (getSize()) {
            case TALL -> result = .29;
            case VENTI -> result = .60;
            case GRANDE -> result = .84;
        }

        return result;
    }
}
