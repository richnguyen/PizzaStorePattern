package edu.virginia.cs.sde.designpatterns;

public class ChicagoStyleCheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // The prepare method steps through creating a cheese pizza,
    // and each time it needs an ingredient, it asks the factory to produce it
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza into square slices");
    }
}
