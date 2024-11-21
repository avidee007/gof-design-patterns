package behavioral.strategy;

public class PaypalPayment implements PaymentStrategy {

  private final String email;

  public PaypalPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Payment of " + amount + " done using Paypal.");
  }
}