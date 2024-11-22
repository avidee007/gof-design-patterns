package structural.decorator;

public class BasePizza implements Pizza {
  @Override
  public String description() {
    return "Base Pizza";
  }

  @Override
  public double price() {
    return 5.0;
  }
}