package creational.abstractfactory;

public class WindowsButton implements Button {
  @Override
  public void render() {
    System.out.println("Windows button rendering.");
  }
}