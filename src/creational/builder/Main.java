package creational.builder;

public class Main {
  public static void main(String[] args) {
    //Creating Car object with builder.
    var myCar = new Car.Builder()
        .make("Honda")
        .model("Civic")
        .year(2022)
        .gears(5)
        .build();

    System.out.println(myCar);

  }
}