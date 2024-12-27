package behavioral.template;

public class OnlineOrderProcessTemplate extends OrderProcessTemplate {
  @Override
  protected void deliverItem() {
    System.out.println("Delivering item ordered online.");

  }

  @Override
  protected void makePayment() {
    System.out.println("Payment done for online order.");

  }

  @Override
  protected void selectItem() {
    System.out.println("Selecting item online.");

  }
}