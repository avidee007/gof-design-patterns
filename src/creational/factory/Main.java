package creational.factory;

public class Main {
  public static void main(String[] args) {
    //Client wants to send email notification
    Notification notification = NotificationFactory.notificationInstance("EMAIL");
    notification.notifyUser();

    //Client wants to send SMS notification
    notification = NotificationFactory.notificationInstance("SMS");
    notification.notifyUser();
  }
}