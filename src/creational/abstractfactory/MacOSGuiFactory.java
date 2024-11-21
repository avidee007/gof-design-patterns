package creational.abstractfactory;

public class MacOSGuiFactory implements GuiFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}