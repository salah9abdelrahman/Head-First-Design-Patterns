package com.salah.introtodesignpatterns.state.vending_machine.problem;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(8);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
