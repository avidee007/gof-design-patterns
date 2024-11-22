package structural.decorator;

public class CheesPizzaDecorator extends PizzaDecorator {
  public CheesPizzaDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String description() {
    return super.description() + ", Cheese loaded";
  }

  @Override
  public double price() {
    return super.price() + 2.0;
  }
}