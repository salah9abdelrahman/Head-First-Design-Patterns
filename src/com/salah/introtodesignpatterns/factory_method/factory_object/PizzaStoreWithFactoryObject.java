package com.salah.introtodesignpatterns.factory_method.factory_object;

import com.salah.introtodesignpatterns.factory_method.*;

public class PizzaStoreWithFactoryObject {
    private final PizzaStoreFactory pizzaStoreFactory;

    public PizzaStoreWithFactoryObject(PizzaStoreFactory pizzaStoreFactory) {
        this.pizzaStoreFactory = pizzaStoreFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = pizzaStoreFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

class PizzaStoreFactory {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
