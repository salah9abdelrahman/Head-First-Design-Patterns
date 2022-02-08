package com.salah.introtodesignpatterns.template_method;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

    }
}
