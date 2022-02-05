package com.salah.introtodesignpatterns.state.vending_machine;

public class SoldState implements State {
    GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn twice");
    }

    @Override
    public void dispense() {
        System.out.println("a gumball in the hole");
        gumballMachine.setCount(gumballMachine.getCount() - 1);
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("Out of gumballs");
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
