//package ru.muhamedshin.RealBook.FACTORY;
//
//public abstract class PizzaStore {
//    public Pizza orderPizza(String type){
//        Pizza pizza;
//
//        pizza = createPizza(type);
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//    }
//
//    abstract Pizza createPizza(String type);
//}
//public class NYPizzaStore extends PizzaStore {
//    Pizza createPizza(String item) {
//        if (item.equals("cheese")) {
//            return new NYStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new NYStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
//        } else return null;
//    }
//}