package Patterns.ChainResponsibility.Example2;

public class ChainOfResponsibilityLogger {
    public static Logger getLoggerChain() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        // Set up chain: INFO → DEBUG → ERROR
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger; // Start with INFO logger
    }
}
