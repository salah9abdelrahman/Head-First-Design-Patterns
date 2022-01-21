package com.salah.introtodesignpatterns.adapter.Duck;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);

        Turkey wildTurkey = new WildTurkey();
        Duck wildTurkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(wildTurkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
