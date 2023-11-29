package ru.muhamedshin.RealBook.DECORATOR.decor;

import ru.muhamedshin.RealBook.DECORATOR.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE -> {
                return beverage.cost() + 0.2;
            }
            case TALL -> {
                return beverage.cost() + 0.5;
            }
            case VENTI -> {
                return beverage.cost() + 0.6;
            }
        }
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
