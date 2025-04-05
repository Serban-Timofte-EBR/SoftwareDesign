package Creationale.X_Practice.LivrariVehicule.models;

public class FurgonetaFactory implements VehiculFactory{
    @Override
    public IVehicul createVehicule() {
        return new Furgoneta();
    }
}
