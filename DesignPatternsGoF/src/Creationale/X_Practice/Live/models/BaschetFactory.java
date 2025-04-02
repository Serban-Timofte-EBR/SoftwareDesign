package Creationale.X_Practice.Live.models;

public class BaschetFactory implements LiveBroadcastCreator{
    @Override
    public Sport createSport(String echipaGazda, String echipaOaspere) {
        return new Baschet(echipaGazda, echipaOaspere);
    }
}
