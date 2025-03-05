package Patterns.ChainResponsibility.Example1;

class LowLevelSupport extends SupportHandler {
    public void handleRequest(String issue, int severity) {
        if (severity <= 2) {
            System.out.println("Low-Level Support: Handling issue - " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, severity);
        }
    }
}





