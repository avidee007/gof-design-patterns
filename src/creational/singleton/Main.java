package creational.singleton;

public class Main {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    System.out.println(instance1.hashCode() == instance2.hashCode());
  }
}