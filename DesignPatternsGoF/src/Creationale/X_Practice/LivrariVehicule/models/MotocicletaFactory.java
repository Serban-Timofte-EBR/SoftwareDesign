package Creationale.X_Practice.LivrariVehicule.models;

public class MotocicletaFactory implements VehiculFactory{
    @Override
    public IVehicul createVehicule() {
        return new Motocicleta();
    }
}
