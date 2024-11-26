package behavioral.strategy;

public class Main {

  public static void main(String[] args) {

    // User selects credit payment
    PaymentContext paymentContext =
        new PaymentContext(new CreditCardPayment("123456789999", "Test", 123, 9, 2027));
    paymentContext.executePayment(100.00);

    // User selects paypal payment
    paymentContext = new PaymentContext(new PaypalPayment("test@test.com"));
    paymentContext.executePayment(100.00);

    // User selects UPI payment
    paymentContext = new PaymentContext(new UpiPayment("1234567890"));
    paymentContext.executePayment(100.00);

  }
}