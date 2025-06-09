package edu.virginia.cs.sde.designpatterns;

public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
      ingredientFactory = new ChicagoPizzaIngredientFactory();
    }
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza;
        switch (item) {
            case "veggie" -> {
                pizza = new ChicagoVeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "pepperoni" -> {
                pizza = new ChicagoPepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
            default -> { //cheese pizza!
                pizza = new ChicagoCheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
        }
        return pizza;


    }
}
