package com.salah.introtodesignpatterns.decorator;

/**
 * Concrete Component that we're going to dynamically add new behavior to it.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
