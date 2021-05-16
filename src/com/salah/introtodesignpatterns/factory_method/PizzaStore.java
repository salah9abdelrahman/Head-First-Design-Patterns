package com.salah.introtodesignpatterns.factory_method;

public abstract class PizzaStore {
    //    orderPizza does not know which subclass will call it <<DECOUPLED>>
    Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

     abstract Pizza createPizza(String type);


}
