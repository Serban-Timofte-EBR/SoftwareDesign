package Creationale.X_Practice.LivrariVehicule.models;

public class LivrareManager {
    public static VehiculFactory getFactory(double greutate) {
        if (greutate > 100) {
            return new CamionFactory();
        } else if (greutate >= 30) {
            return new FurgonetaFactory();
        } else {
            return new MotocicletaFactory();
        }
    }
}
