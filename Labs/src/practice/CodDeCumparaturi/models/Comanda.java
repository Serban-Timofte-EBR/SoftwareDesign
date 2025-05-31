package practice.CodDeCumparaturi.models;

public class Comanda implements IComanda{
    private double valoareCumparaturi;
    private String adresa;

    public Comanda(double valoareCumparaturi, String adresa) {
        this.valoareCumparaturi = valoareCumparaturi;
        this.adresa = adresa;
    }

    @Override
    public double calculareValoareComanda() {
        double costTransport = adresa.length() % 2 == 0 ? 5.5 : 7.5;
        return this.valoareCumparaturi + costTransport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("valoareCumparaturi=").append(valoareCumparaturi);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
