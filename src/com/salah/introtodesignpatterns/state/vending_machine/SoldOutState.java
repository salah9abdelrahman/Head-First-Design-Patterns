package com.salah.introtodesignpatterns.state.vending_machine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, SOLD OUT");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject, no quarter inserted yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("there is no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
