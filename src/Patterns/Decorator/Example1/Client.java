package Patterns.Decorator.Example1;

public class Client {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();
        notification = new EmailNotification(notification);
        notification = new SMSNotification(notification);
        notification = new PushNotification(notification);

        notification.send("Hello, this is a multi-channel notification!");
    }
}
