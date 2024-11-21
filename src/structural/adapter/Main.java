package structural.adapter;

public class Main {
  public static void main(String[] args) {
    Socket socket = new StandardSocket();
    EuropeanDevice europeanDevice = new SocketAdapter(socket);
    europeanDevice.powerOn();
  }
}