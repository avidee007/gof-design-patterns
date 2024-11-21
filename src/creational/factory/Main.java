package creational.factory;

public class Main {
  public static void main(String[] args) {
    //Client wants to send email notification
    Notification email = NotificationFactory.notificationInstance("EMAIL");
    email.notifyUser();

    //Client wants to send email notification
    Notification sms = NotificationFactory.notificationInstance("SMS");
    sms.notifyUser();
  }
}