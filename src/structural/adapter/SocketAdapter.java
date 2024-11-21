package structural.adapter;

public class SocketAdapter implements EuropeanDevice {
  private final Socket socket;

  public SocketAdapter(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void powerOn() {
    int voltage = socket.getVoltage();
    System.out.printf(
        "Adapting power voltage of 220V from input voltage of %d for European device%n",
        voltage);

  }
}