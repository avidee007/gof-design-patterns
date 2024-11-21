package behavioral.strategy;

public class UpiPayment implements PaymentStrategy {

  private final String mobileNumber;

  public UpiPayment(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Payment of " + amount + " done through UPI.");
  }
}