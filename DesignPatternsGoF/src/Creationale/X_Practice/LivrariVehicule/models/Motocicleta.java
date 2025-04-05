package Creationale.X_Practice.LivrariVehicule.models;

public class Motocicleta implements IVehicul{
    @Override
    public double calculeazaTimpLivrare(double greutate, double distanta) {
        return distanta / 100 + greutate * 0.03;
    }
}
