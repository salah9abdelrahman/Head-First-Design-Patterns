package com.salah.introtodesignpatterns.abstract_factory;

public interface PizzaIngredientFactory {
    // products
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
