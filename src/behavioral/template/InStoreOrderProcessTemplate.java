package behavioral.template;

public class InStoreOrderProcessTemplate extends OrderProcessTemplate {
  @Override
  protected void deliverItem() {
    System.out.println("Handing over item pushed in store.");
  }

  @Override
  protected void makePayment() {
    System.out.println("Payment received for item pushed in store.");
  }

  @Override
  protected void selectItem() {
    System.out.println("Item selected in store.");
  }
}