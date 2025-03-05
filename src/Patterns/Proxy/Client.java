package Patterns.Proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com"); // Blocked site
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

