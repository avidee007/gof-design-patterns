package behavioral.strategy;

public class Main {

  public static void main(String[] args) {

    // User selects credit payment
    PaymentStrategy creditCardPayment = new CreditCardPayment("123456789999", "Test", 123, 9, 2027);
    creditCardPayment.pay(100.00);

    // User selects paypal payment
    PaymentStrategy paypalPayment = new PaypalPayment("test@test.com");
    paypalPayment.pay(100.00);

    // User selects UPI payment
    PaymentStrategy upiPayment = new UpiPayment("1234567890");
    upiPayment.pay(100.00);


  }
}