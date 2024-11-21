package creational.factory;

public class NotificationFactory {
  private NotificationFactory() {
    throw new IllegalStateException("Factory util class.");
  }

  static Notification notificationInstance(String type) {
    return switch (type) {
      case "EMAIL" -> new EmailNotification();
      case "SMS" -> new SmsNotification();
      default -> throw new IllegalArgumentException("Invalid notification type: " + type);
    };
  }
}