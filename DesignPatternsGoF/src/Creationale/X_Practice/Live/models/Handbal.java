package Creationale.X_Practice.Live.models;

import java.util.List;

public class Handbal extends Sport {
    public Handbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public LiveBroadcast startLiveBroadcast(LiveBroadcastFactory prototypeFactory, String platform) {
        LiveBroadcast live = prototypeFactory.createLiveBroadcast(platform);
        live.setLiveFeed(List.of("Fast break", "7m throw", "Defense strategy"));
        live.addComentariu("Meci de handbal: " + echipaGazda + " vs " + echipaOaspete);
        return live;
    }
}
