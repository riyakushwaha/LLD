package Patterns.Decorator.Example1;

public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}