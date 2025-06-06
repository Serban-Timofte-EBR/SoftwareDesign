package Creationale.X_Practice.Live.models;

import java.util.List;

public class Baschet extends Sport {
    public Baschet(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public LiveBroadcast startLiveBroadcast(LiveBroadcastFactory prototypeFactory, String platform) {
        LiveBroadcast live = prototypeFactory.createLiveBroadcast(platform);
        live.setLiveFeed(List.of("Fast break", "Three-point shot", "Pick and roll"));
        live.addComentariu("Meci de baschet: " + echipaGazda + " vs " + echipaOaspete);
        return live;
    }
}
