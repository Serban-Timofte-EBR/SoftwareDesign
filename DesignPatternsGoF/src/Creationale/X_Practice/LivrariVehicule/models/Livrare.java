package Creationale.X_Practice.LivrariVehicule.models;


public class Livrare {
    private double greutate;
    private double distanta;
    private IVehicul vehicul;

    public Livrare(double greutate, double distanta) {
        this.greutate = greutate;
        this.distanta = distanta;
        this.vehicul = LivrareManager.getFactory(greutate).createVehicule();
    }

    public double calculeazaTimp() {
        return vehicul.calculeazaTimpLivrare(greutate, distanta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livrare{");
        sb.append("distanta=").append(distanta);
        sb.append(", greutate=").append(greutate);
        sb.append(", vehicul=").append(vehicul);
        sb.append('}');
        return sb.toString();
    }
}
