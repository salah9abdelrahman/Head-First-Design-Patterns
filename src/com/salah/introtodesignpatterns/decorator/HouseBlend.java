package com.salah.introtodesignpatterns.decorator;

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
