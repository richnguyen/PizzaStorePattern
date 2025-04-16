package edu.virginia.cs.sde.designpatterns;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        ingredientFactory = new NYPizzaIngredientFactory();
    }
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza;

        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggies Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
            default -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
        }
        return pizza;




    }
}
