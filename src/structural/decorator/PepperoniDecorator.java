package structural.decorator;

public class PepperoniDecorator extends PizzaDecorator {
  public PepperoniDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String description() {
    return super.description() + ", pepperoni";
  }

  @Override
  public double price() {
    return super.price() + 1.0;
  }
}