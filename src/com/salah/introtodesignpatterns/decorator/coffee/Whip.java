package com.salah.introtodesignpatterns.decorator.coffee;

/**
 * Concrete Decorator
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
