package Creationale.X_Practice.RezervariMecaniService.models;

public class RezervareBuilder implements IBuilder {
    private String numeClient;
    private String numarMasina = "";
    private String detaliiInterventie = "";
    private String dataRezervare;

    public RezervareBuilder(String numeClient, String dataRezervare) {
        this.numeClient = numeClient;
        this.dataRezervare = dataRezervare;
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setDataRezervare(String dataRezervare) {
        this.dataRezervare = dataRezervare;
        return this;
    }

    public RezervareBuilder setNumarMasina(String numarMasina) {
        this.numarMasina = numarMasina;
        return this;
    }

    public RezervareBuilder setDetaliiInterventie(String detaliiInterventie) {
        this.detaliiInterventie = detaliiInterventie;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(numeClient, numarMasina, detaliiInterventie, dataRezervare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareBuilder{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarMasina='").append(numarMasina).append('\'');
        sb.append(", detaliiInterventie='").append(detaliiInterventie).append('\'');
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
