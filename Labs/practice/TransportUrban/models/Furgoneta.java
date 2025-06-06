package Creationale.X_Practice.TransportUrban.models;

public class Furgoneta extends Vehicul{
    private int greutateMaxima;
    private final int consumMediu;

    Furgoneta(String numarInregistrare) {
        this.setNumarInregistratre(numarInregistrare);
        this.setTipTransport(TipTransport.VOLUM_MEDIU);
        this.consumMediu = 10;
    }

    public int getGreutateMaxima() {
        return greutateMaxima;
    }

    public void setGreutateMaxima(int greutateMaxima) {
        this.greutateMaxima = greutateMaxima;
    }

    public int getConsumMediu() {
        return consumMediu;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("=========== Fugoneta ==========");
        System.out.println("\t" + this.getNumarInregistratre());
        System.out.println("\t" + this.getTipTransport());
        System.out.println("\t" + this.consumMediu);
        System.out.println("\t" + this.greutateMaxima);
    }
}
