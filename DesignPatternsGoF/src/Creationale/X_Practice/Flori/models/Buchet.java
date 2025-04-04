package Creationale.X_Practice.Flori.models;

import java.util.ArrayList;
import java.util.List;

public class Buchet implements IBuchetPrototype{
    private TipBuchet tipBuchet;
    private List<String> flori;
    private String culoareaPrincipala;
    private String mesajCartonas;
    private String adresaLivare;

    Buchet(TipBuchet tipBuchet, List<String> flori, String culoareaPrincipala) {
        this.tipBuchet = tipBuchet;
        this.flori = flori;
        this.culoareaPrincipala = culoareaPrincipala;
    }

    public void addFloare(String floare) {
        this.flori.add(floare);
    }

    public Buchet setMesajCartonas(String mesajCartonas) {
        this.mesajCartonas = mesajCartonas;
        return this;
    }

    public Buchet setAdresaLivare(String adresaLivare) {
        this.adresaLivare = adresaLivare;
        return this;
    }

    @Override
    public Buchet createBuchet() {
        try {
            Buchet clone = (Buchet) super.clone();
            clone.flori = new ArrayList<String>(flori);
            return clone;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buchet{");
        sb.append("tipBuchet=").append(tipBuchet);
        sb.append(", flori=").append(flori);
        sb.append(", culoareaPrincipala='").append(culoareaPrincipala).append('\'');
        sb.append(", mesajCartonas='").append(mesajCartonas).append('\'');
        sb.append(", adresaLivare='").append(adresaLivare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
