package Creationale.X_Practice.Live.models;

import java.util.Map;

public class LiveBroadcastFactory {
    private static LiveBroadcast prototype;

    public LiveBroadcastFactory() {
        this.prototype = new LiveBroadcast("default");
    }

    public LiveBroadcast createLiveBroadcast(String platform) {
        try {
            return prototype.launchLiveBroadcast(platform);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
