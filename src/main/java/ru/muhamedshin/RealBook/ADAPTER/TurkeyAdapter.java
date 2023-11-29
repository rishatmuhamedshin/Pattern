package ru.muhamedshin.RealBook.ADAPTER;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
