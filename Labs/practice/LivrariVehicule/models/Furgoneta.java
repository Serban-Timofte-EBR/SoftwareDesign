package Creationale.X_Practice.LivrariVehicule.models;

public class Furgoneta implements IVehicul{
    @Override
    public double calculeazaTimpLivrare(double greutate, double distanta) {
        return distanta / 80 + greutate * 0.05;
    }
}
