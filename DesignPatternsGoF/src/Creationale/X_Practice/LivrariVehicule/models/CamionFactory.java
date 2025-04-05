package Creationale.X_Practice.LivrariVehicule.models;

public class CamionFactory implements VehiculFactory {
    @Override
    public IVehicul createVehicule() {
        return new Camion();
    }
}
