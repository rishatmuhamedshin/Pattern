package ru.muhamedshin.RealBook.DECORATOR.decor;

import ru.muhamedshin.RealBook.DECORATOR.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    public abstract String getDescription();
    public abstract Size getSize();


}
