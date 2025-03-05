package Patterns.ChainResponsibility.Example1;

abstract class SupportHandler {
    protected SupportHandler nextHandler; // Next handler in the chain

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue, int severity);
}

