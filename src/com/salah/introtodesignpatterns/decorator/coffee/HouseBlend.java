package com.salah.introtodesignpatterns.decorator.coffee;

/**
 * Concrete Component that we're going to dynamically add new behavior to it.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 2.10;
    }
}
