package creational.factory;

public class EmailNotification implements Notification {

  @Override
  public void notifyUser() {
    System.out.println("Email notification was sent.");
  }
}