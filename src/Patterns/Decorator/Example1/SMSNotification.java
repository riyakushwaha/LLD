package Patterns.Decorator.Example1;

public class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS notification: " + message);
    }
}
