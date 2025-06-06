package Creationale.X_Practice.TransportUrban.models;

public class MotocicletaCargo extends Vehicul{
    private int greutateMaxima;
    private final int consumMediu;

    public MotocicletaCargo(String numarInregistrare) {
        this.setNumarInregistratre(numarInregistrare);
        this.setTipTransport(TipTransport.COLETE_MICI);
        this.consumMediu = 7;
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
        System.out.println("=========== Motocicleta Cargo ==========");
        System.out.println("\t" + this.getNumarInregistratre());
        System.out.println("\t" + this.getTipTransport());
        System.out.println("\t" + this.consumMediu);
        System.out.println("\t" + this.greutateMaxima);
    }
}
