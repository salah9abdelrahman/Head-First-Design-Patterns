package com.salah.introtodesignpatterns.template_method.problem;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    void boilWater(){
        System.out.println("Boiling water");
    }

    void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk(){
        System.out.println("Add Sugar And Milk");
    }
}
