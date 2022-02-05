package com.salah.introtodesignpatterns.state.vending_machine;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned");
        gumballMachine.setState(gumballMachine.getSoldState());
        gumballMachine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
