package com.salah.introtodesignpatterns.factory_method.factory_object;

import com.salah.introtodesignpatterns.factory_method.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaStoreFactory pizzaStoreFactory = new PizzaStoreFactory();
        PizzaStoreWithFactoryObject pizzaStoreWithFactoryObject
                = new PizzaStoreWithFactoryObject(pizzaStoreFactory);

    Pizza pizza = pizzaStoreWithFactoryObject.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
