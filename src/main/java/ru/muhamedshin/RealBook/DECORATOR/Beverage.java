package ru.muhamedshin.RealBook.DECORATOR;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    private String description = "Unknown Beverage";


    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
