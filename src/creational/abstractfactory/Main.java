package creational.abstractfactory;

public class Main {
  private final Button button;
  private final CheckBox checkBox;

  void render() {
    button.render();
    checkBox.render();
  }

  public Main(GuiFactory guiFactory) {
    this.button = guiFactory.createButton();
    this.checkBox = guiFactory.createCheckBox();
  }

  public static void main(String[] args) {
    //Window app rendering.
    Main windowsApp = new Main(new WindowsGuiFactory());
    windowsApp.render();

    //MacOS app rendering.
    Main macOsApp = new Main(new MacOSGuiFactory());
    macOsApp.render();

  }
}