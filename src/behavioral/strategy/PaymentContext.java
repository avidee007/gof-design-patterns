package behavioral.strategy;

public class PaymentContext {

  private final PaymentStrategy paymentStrategy;

  public PaymentContext(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void executePayment(double amount) {
    paymentStrategy.pay(amount);
  }
}