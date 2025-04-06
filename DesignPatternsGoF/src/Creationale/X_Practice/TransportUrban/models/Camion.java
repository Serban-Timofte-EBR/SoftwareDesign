package Creationale.X_Practice.TransportUrban.models;

public class Camion extends Vehicul{
    private int greutateMaxima;
    private final int consumMediu;

    Camion(String numarInregistrare) {
        this.setNumarInregistratre(numarInregistrare);
        this.setTipTransport(TipTransport.MARFA_GREA);
        this.consumMediu = 18;
    }

    public int getConsumMediu() {
        return consumMediu;
    }

    public int getGreutateMaxima() {
        return greutateMaxima;
    }

    public void setGreutateMaxima(int greutateMaxima) {
        this.greutateMaxima = greutateMaxima;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("=========== Camion ==========");
        System.out.println("\t" + this.getNumarInregistratre());
        System.out.println("\t" + this.getTipTransport());
        System.out.println("\t" + this.consumMediu);
        System.out.println("\t" + this.greutateMaxima);
    }
}
