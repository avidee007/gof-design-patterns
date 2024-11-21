package creational.abstractfactory;

public class WindowCheckBox implements CheckBox {
  @Override
  public void render() {
    System.out.println("Windows checkbox rendering.");
  }
}