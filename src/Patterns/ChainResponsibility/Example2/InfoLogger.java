package Patterns.ChainResponsibility.Example2;

class InfoLogger extends Logger {
    public InfoLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}