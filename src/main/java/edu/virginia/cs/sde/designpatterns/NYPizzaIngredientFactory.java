package edu.virginia.cs.sde.designpatterns;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Sauce createSauce() {
        return new MarianaSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Veggies[] createVeggie() {
        return new Veggies[] {new Garlic(), new Mushroom(), new RedPepper() };
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
