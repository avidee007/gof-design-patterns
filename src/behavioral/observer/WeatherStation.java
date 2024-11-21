package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
  private final List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;


  public WeatherStation() {
    observers = new ArrayList<>();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObserver();
  }

  @Override
  public void addObserver(Observer o) {
    observers.add(o);

  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);

  }

  @Override
  public void notifyObserver() {
    observers.forEach(observer -> observer.update(temperature, humidity, pressure));

  }
}