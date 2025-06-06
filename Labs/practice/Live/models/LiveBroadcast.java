package Creationale.X_Practice.Live.models;

import java.util.ArrayList;
import java.util.List;

public class LiveBroadcast implements Live {
    private String platform;
    private List<String> liveFeed;
    private List<String> comentarii;

    LiveBroadcast(String platform) {
        this.platform = platform;
        try {
            Thread.sleep(200);
            this.liveFeed = new ArrayList<>();
            liveFeed.add("Live feed started");
            liveFeed.add("Live feed is running");
            liveFeed.add("Speaking about the topic");
            liveFeed.add("Live feed is ending");
            Thread.sleep(200);
            this.comentarii = new ArrayList<>();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<String> getLiveFeed() {
        return liveFeed;
    }

    public LiveBroadcast setLiveFeed(List<String> liveFeed) {
        this.liveFeed = liveFeed;
        return this;
    }

    public List<String> getComentarii() {
        return comentarii;
    }

    public void addComentariu(String comentariu) {
        this.comentarii.add(comentariu);
    }

    // Clone paralel
    @Override
    public LiveBroadcast launchLiveBroadcast(String platform) throws CloneNotSupportedException {
        LiveBroadcast clonedLive = (LiveBroadcast) super.clone();
        clonedLive.platform = platform;
        clonedLive.setLiveFeed(this.liveFeed);
        clonedLive.comentarii = new ArrayList<>();
        return clonedLive;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LiveBroadcast{");
        sb.append("\nplatform='").append(platform).append('\'');
        sb.append(", \nliveFeed=").append(liveFeed);
        sb.append(", \ncomentarii=").append(comentarii);
        sb.append("\n}\n");
        return sb.toString();
    }
}
