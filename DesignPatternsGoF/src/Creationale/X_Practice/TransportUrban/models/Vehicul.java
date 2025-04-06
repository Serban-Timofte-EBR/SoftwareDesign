package Creationale.X_Practice.TransportUrban.models;

public abstract class Vehicul {
    private String numarInregistratre;
    private TipTransport tipTransport;

    Vehicul() {
    }

    public String getNumarInregistratre() {
        return numarInregistratre;
    }

    public void setNumarInregistratre(String numarInregistratre) {
        this.numarInregistratre = numarInregistratre;
    }

    public TipTransport getTipTransport() {
        return tipTransport;
    }

    public void setTipTransport(TipTransport tipTransport) {
        this.tipTransport = tipTransport;
    }

    abstract void afiseazaDetalii();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicul{");
        sb.append("numarInregistratre='").append(numarInregistratre).append('\'');
        sb.append(", tipTransport=").append(tipTransport);
        sb.append('}');
        return sb.toString();
    }
}
