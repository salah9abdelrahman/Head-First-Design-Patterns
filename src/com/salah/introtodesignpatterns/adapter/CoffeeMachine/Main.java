package com.salah.introtodesignpatterns.adapter.CoffeeMachine;

public class Main {
    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
        coffeeTouchscreenAdapter.chooseFirstSelection();
    }
}
