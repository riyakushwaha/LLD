package Patterns.ChainResponsibility.Example2;

class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}