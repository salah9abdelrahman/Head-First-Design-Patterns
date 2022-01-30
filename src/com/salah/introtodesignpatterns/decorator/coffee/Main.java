package com.salah.introtodesignpatterns.decorator.coffee;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        /*
         * beverage2.cost()
         * it works like recursion.
         * first get the cost of whip => mocha => mocha => HouseBlend (until the concrete component)
         */
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        /*
        type of class is not maintainable
         */
        System.out.println(beverage.getClass());
    }
}
