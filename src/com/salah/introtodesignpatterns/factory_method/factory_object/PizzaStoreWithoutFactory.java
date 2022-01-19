package com.salah.introtodesignpatterns.factory_method.factory_object;

import com.salah.introtodesignpatterns.factory_method.ChicageStyleVeggiePizza;
import com.salah.introtodesignpatterns.factory_method.LAStyleCheesePizza;
import com.salah.introtodesignpatterns.factory_method.LAStyleVeggiePizza;
import com.salah.introtodesignpatterns.factory_method.Pizza;

public class PizzaStoreWithoutFactory {

    Pizza orderPizza(String type) {
        Pizza pizza = null;

        // what varies
        if(type.equals("bla")){
            pizza = new ChicageStyleVeggiePizza();
        }
        else if(type.equals("bla2")){
            pizza = new LAStyleCheesePizza();
        }
        else if (type.equals("dsc")){
            pizza = new LAStyleVeggiePizza();
        }

        // what stays the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
