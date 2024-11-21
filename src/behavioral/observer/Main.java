package behavioral.observer;

public class Main {
  public static void main(String[] args) {
    // Create whether station.
    WeatherStation weatherStation = new WeatherStation();

    //Set weather
    weatherStation.setMeasurements(32.5f, 80.92f, 91.09f);

    //Add observers
    Observer mobileApp = new MobileWhetherApp();
    Observer windowsApp = new WindowsWhetherApp();
    weatherStation.addObserver(mobileApp);
    weatherStation.addObserver(windowsApp);

    //Broadcast whether updates.
    weatherStation.notifyObserver();

    //Remove observer
    weatherStation.removeObserver(windowsApp);
    weatherStation.notifyObserver();

  }
}