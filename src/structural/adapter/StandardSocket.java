package structural.adapter;

public class StandardSocket implements Socket {
  @Override
  public int getVoltage() {
    return 110;
  }
}