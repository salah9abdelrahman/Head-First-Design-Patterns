package com.salah.introtodesignpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        /*
         * beverage2.cost()
         * it works like recursion.
         * first get the cost of whip => mocha => mocha => HouseBlend (until the concrete component)
         */
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        /*
        type of class is not maintainable
         */
        System.out.println(beverage2.getClass());
    }
}
