package Creationale.X_Practice.Live.models;

public class FotbalFactory implements LiveBroadcastCreator{
    @Override
    public Sport createSport(String echipaGazda, String echipaOaspere) {
        return new Fotbal(echipaGazda, echipaOaspere);
    }
}
