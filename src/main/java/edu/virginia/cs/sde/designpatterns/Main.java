package edu.virginia.cs.sde.designpatterns;

public class Main {
    public static void main(String[] args) {

        // Create the stores
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // Client code to order some pizza from two separate store
        // NY Store
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Emily ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Enzo ordered a " + pizza.getName() + "\n");


        // Chicago Store
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Jane ordered a " + pizza.getName() + "\n");
    }
}