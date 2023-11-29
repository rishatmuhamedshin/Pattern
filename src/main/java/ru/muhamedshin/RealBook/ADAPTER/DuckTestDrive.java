package ru.muhamedshin.RealBook.ADAPTER;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey say...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);


    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
