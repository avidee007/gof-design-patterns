package creational.abstractfactory;

public class MacCheckBox implements CheckBox {
  @Override
  public void render() {
    System.out.println("Mac OS checkbox rendering.");
  }
}