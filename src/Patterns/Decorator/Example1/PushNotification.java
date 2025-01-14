package Patterns.Decorator.Example1;

public class PushNotification extends NotificationDecorator {
    public PushNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending push notification: " + message);
    }
}
