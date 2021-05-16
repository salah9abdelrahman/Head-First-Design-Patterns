package com.salah.introtodesignpatterns.factory_method;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicageStyleStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Sammar ordered " + pizza.getName());
        pizza = chicageStyleStore.orderPizza("cheese");
        System.out.println("Spring ordered " + pizza.getName());
    }
}
