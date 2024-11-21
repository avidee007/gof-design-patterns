package behavioral.observer;

public class MobileWhetherApp implements Observer {
  @Override
  public void update(float temperature, float humidity, float pressure) {
    var whether =
        String.format("Temperature : %s, Humidity : %s, Pressure : %s", temperature, humidity,
            pressure);
    System.out.println("Displaying whether updates on mobile." + whether);
  }
}