package com.salah.introtodesignpatterns.state.vending_machine;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;
    private int count = 0;


    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new NoQuarterState(this);

        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }


    public State getHasQuarterState() {
        return hasQuarterState;
    }


    public State getSoldState() {
        return soldState;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
