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
            case "veggie" -> {
                pizza = new NYVeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggies Pizza");
            }
            case "pepperoni" -> {
                pizza = new NYPepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
            default -> { //cheese pizza
                pizza = new NYCheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
        }
        return pizza;




    }
}
