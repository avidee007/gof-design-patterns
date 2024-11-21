package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

  private final String creditCardNumber;
  private final String cardHolderName;
  private final int ccv;
  private final int expiryMonth;
  private final int expiryYear;

  public CreditCardPayment(String creditCardNumber, String cardHolderName, int ccv, int expiryMonth,
                           int expiryYear) {
    this.creditCardNumber = creditCardNumber;
    this.cardHolderName = cardHolderName;
    this.ccv = ccv;
    this.expiryMonth = expiryMonth;
    this.expiryYear = expiryYear;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Payment of " + amount + " done from credit card.");
  }


}