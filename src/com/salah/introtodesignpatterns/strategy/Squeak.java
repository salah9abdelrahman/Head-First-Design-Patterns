package com.salah.introtodesignpatterns.strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("squack squack!");
    }
}
