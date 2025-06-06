package Creationale.X_Practice.Live.models;

public class HandbalFactory implements LiveBroadcastCreator{
    @Override
    public Sport createSport(String echipaGazda, String echipaOaspere) {
        return new Handbal(echipaGazda, echipaOaspere);
    }
}
