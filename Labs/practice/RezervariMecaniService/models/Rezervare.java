package Creationale.X_Practice.RezervariMecaniService.models;

public class Rezervare {
    private String numeClient;
    private String numarMasina;
    private String detaliiInterventie;
    private String dataRezervare;

    Rezervare(String numeClient, String numarMasina, String detaliiInterventie, String dataRezervare) {
        this.numeClient = numeClient;
        this.numarMasina = numarMasina;
        this.detaliiInterventie = detaliiInterventie;
        this.dataRezervare = dataRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarMasina='").append(numarMasina).append('\'');
        sb.append(", detaliiInterventie='").append(detaliiInterventie).append('\'');
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
