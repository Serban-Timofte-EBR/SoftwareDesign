package Creationale.X_Practice.TransportUrban.models;

public class VehiculFactory implements IFactory {
    private String numarInregistratre;

    public VehiculFactory(String numarInregistratre) {
        this.numarInregistratre = numarInregistratre;
    }

    @Override
    public Vehicul creeazaVehicul(int greutate) {
        if (greutate >= 3000) {
            return new Camion(numarInregistratre);
        } else if (greutate >= 1000) {
            return new Furgoneta(numarInregistratre);
        } else if (greutate <= 100) {
            return new MotocicletaCargo(numarInregistratre);
        } else {
            System.out.println("[ERROR] Coletul are o greutate gresita!");
            return null;
        }
    }
}
