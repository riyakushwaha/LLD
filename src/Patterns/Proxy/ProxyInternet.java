package Patterns.Proxy;

import java.util.*;

class ProxyInternet implements Internet {
    private Internet realInternet = new RealInternet();
    private static List<String> blockedSites = new ArrayList<>();

    static {
        blockedSites.add("facebook.com");
        blockedSites.add("youtube.com");
        blockedSites.add("twitter.com");
    }

    public void connectTo(String serverHost) throws Exception {
        if (blockedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied to " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }
}

