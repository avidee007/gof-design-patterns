package creational.abstractfactory;

public class MacButton implements Button {
  @Override
  public void render() {
    System.out.println("Mac OS button rendering.");
  }
}