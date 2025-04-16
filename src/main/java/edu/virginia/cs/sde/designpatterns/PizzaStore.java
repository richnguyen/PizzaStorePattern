package edu.virginia.cs.sde.designpatterns;

public abstract class PizzaStore {
    public PizzaStore() {
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
    // other methods here
}
