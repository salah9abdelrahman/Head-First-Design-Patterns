package com.salah.introtodesignpatterns.template_method;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steep Tea bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
