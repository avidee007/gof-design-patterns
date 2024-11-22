package structural.decorator;

public class Main {
  public static void main(String[] args) {
    Pizza pizza = new BasePizza();

    //Customer customised pizza to be cheese burst.
    pizza = new CheesPizzaDecorator(pizza);
    System.out.println("Extra cheese added.");

    //Customer customised pizza to have pepperoni toppings.
    pizza = new PepperoniDecorator(pizza);
    System.out.println("Pepperoni toppings added.");


    System.out.println("Final pizza is ready.");
    System.out.printf("Description = %s. Price = $ %s.", pizza.description(), pizza.price());
  }
}