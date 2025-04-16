package edu.virginia.cs.sde.designpatterns;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggie();
    Pepperoni createPepperoni();
}
