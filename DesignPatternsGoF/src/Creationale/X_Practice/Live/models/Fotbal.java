package Creationale.X_Practice.Live.models;

import java.util.List;

public class Fotbal extends Sport {
    public Fotbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public LiveBroadcast startLiveBroadcast(LiveBroadcastFactory factory, String platform) {
        LiveBroadcast lb = factory.createLiveBroadcast(platform);
        lb.setLiveFeed(List.of("Tiki-taka", "Counter-attack", "Set piece"));
        lb.addComentariu("Meci de fotbal: " + echipaGazda + " vs " + echipaOaspete);
        return lb;
    }
}
