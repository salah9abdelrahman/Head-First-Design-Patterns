package com.salah.introtodesignpatterns.state.vending_machine.problem;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, SOLD OUT");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't insert a quarter");
        } else if (state == SOLD) {
            System.out.println("Sorry, you turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't eject, no quarter inserted yet");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Can't turn twice");
        } else if (state == NO_QUARTER) {
            System.out.println("No quarter inserted");
        } else if (state == SOLD_OUT) {
            System.out.println("there is no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("you turned");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("a gumball in the hole");
            count--;
            if (count == 0) {
                state = SOLD_OUT;
                System.out.println("Out of gumballs");
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }
}
