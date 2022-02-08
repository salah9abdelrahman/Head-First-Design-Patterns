package com.salah.introtodesignpatterns.template_method.problem;

public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    void boilWater(){
        System.out.println("Boiling water");
    }

    void steepTeaBag(){
        System.out.println("Steep Tea bag");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addLemon(){
        System.out.println("Adding Lemon");
    }
}
