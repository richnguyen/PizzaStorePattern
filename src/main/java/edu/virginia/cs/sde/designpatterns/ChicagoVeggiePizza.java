package edu.virginia.cs.sde.designpatterns;

public class ChicagoVeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // The prepare method steps through creating a cheese pizza,
    // and each time it needs an ingredient, it asks the factory to produce it
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggie();
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza into square slices");
    }
}
