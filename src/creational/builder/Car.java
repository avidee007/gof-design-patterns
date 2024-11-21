package creational.builder;

public class Car {
  private String make;
  private String model;
  private int year;
  private int gears;

  private Car(Builder builder) {
    this.make = builder.make;
    this.model = builder.model;
    this.year = builder.year;
    this.gears = builder.gears;
  }

  @Override
  public String toString() {
    return "Car{" +
        "make='" + make + '\'' +
        ", model='" + model + '\'' +
        ", year=" + year +
        ", gears=" + gears +
        '}';
  }

  public static class Builder {
    private String make;
    private String model;
    private int year;
    private int gears;

    public Builder make(String make) {
      this.make = make;
      return this;
    }

    public Builder model(String model) {
      this.model = model;
      return this;
    }

    public Builder year(int year) {
      this.year = year;
      return this;
    }

    public Builder gears(int gears) {
      this.gears = gears;
      return this;
    }

    public Car build() {
      return new Car(this);
    }


  }

}