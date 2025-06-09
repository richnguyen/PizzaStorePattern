package edu.virginia.cs.sde.designpatterns;

public class ChicagoPepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoPepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // The prepare method steps through creating a cheese pizza,
    // and each time it needs an ingredient, it asks the factory to produce it
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza into square slices");
    }
}
