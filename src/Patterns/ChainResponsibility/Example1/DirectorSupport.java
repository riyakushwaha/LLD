package Patterns.ChainResponsibility.Example1;

class DirectorSupport extends SupportHandler {
    public void handleRequest(String issue, int severity) {
        if (severity > 5) {
            System.out.println("Director Support: Handling issue - " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue, severity);
        }
    }
}
