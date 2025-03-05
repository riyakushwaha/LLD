package Patterns.ChainResponsibility.Example1;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler lowLevel = new LowLevelSupport();
        SupportHandler manager = new ManagerSupport();
        SupportHandler director = new DirectorSupport();

        // Set up the chain
        lowLevel.setNextHandler(manager);
        manager.setNextHandler(director);

        // Make support requests with different severity levels
        lowLevel.handleRequest("Password reset", 1);
        lowLevel.handleRequest("Account suspension", 4);
        lowLevel.handleRequest("Data breach", 7);
    }
}

