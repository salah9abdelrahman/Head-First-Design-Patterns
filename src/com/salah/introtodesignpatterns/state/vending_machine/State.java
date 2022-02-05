package com.salah.introtodesignpatterns.state.vending_machine;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
