package com.salah.introtodesignpatterns.decorator;

public abstract class Beverage {
     String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
