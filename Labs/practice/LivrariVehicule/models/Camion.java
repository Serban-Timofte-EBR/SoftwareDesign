package Creationale.X_Practice.LivrariVehicule.models;

public class Camion implements IVehicul{
    @Override
    public double calculeazaTimpLivrare(double greutate, double distanta) {
        return distanta / 60 + greutate * 0.1;
    }
}
