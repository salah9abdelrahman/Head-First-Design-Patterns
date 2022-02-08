package com.salah.introtodesignpatterns.template_method;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }


    @Override
    public void addCondiments() {
        System.out.println("Add Sugar And Milk");
    }
}
