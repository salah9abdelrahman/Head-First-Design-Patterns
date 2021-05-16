package com.salah.introtodesignpatterns.factory_method;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicageStyleVeggiePizza();
        }
        return null;
    }
}
