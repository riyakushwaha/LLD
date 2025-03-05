package Patterns.ChainResponsibility.Example2;

public class Client {
    public static void main(String[] args) {
        Logger loggerChain = ChainOfResponsibilityLogger.getLoggerChain();

        // Logging messages at different levels
        loggerChain.logMessage(Logger.INFO, "This is an information message.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }
}
