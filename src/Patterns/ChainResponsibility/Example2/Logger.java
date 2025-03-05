package Patterns.ChainResponsibility.Example2;

abstract class Logger {
    protected Logger nextLogger;
    protected int level;

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level == level) {  // Handle only matching level
            write(message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}

