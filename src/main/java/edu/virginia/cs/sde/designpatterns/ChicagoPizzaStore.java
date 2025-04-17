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
                pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "pepperoni" -> {
                pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
            default -> { //cheese pizza!
                pizza = new ChicagoStyleCheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
        }
        return pizza;


    }
}
