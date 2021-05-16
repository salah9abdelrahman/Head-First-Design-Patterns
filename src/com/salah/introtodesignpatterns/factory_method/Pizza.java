package com.salah.introtodesignpatterns.factory_method;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();


    public void prepare(){
        System.out.println("preparing " + name);
    }
    public void bake(){
        System.out.println("baking " + name);

    }
    public void cut(){
        System.out.println("cut " + name);
    }
    public void box(){
        System.out.println("boxing " + name);
    }

    public String getName() {
        return name;
    }
}
