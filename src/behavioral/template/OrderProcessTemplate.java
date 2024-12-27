package behavioral.template;

public abstract class OrderProcessTemplate {

  public final void processOrder() {
    selectItem();
    makePayment();
    deliverItem();
  }

  protected abstract void deliverItem();

  protected abstract void makePayment();

  protected abstract void selectItem();
}