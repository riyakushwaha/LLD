package Patterns.ChainResponsibility.Example1;

class ManagerSupport extends SupportHandler {
    public void handleRequest(String issue, int severity) {
        if (severity <= 5) {
            System.out.println("Manager Support: Handling issue - " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, severity);
        }
    }
}