package edu.virginia.cs.sde.designpatterns;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Veggies[] createVeggie() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom()};
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
