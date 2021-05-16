package com.salah.introtodesignpatterns.factory_method;

public class LAStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new LAStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new LAStyleVeggiePizza();
        }
        return null;
    }
}
