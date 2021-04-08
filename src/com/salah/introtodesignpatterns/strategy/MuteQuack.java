package com.salah.introtodesignpatterns.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println();
    }
}
