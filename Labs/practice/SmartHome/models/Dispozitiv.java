package Creationale.X_Practice.SmartHome.models;

import java.util.List;

public class Dispozitiv {
    private TipuriDispozitiv tip;
    private String protocolConectare;
    private List<String> senzori;

    Dispozitiv(TipuriDispozitiv tip, String protocolConectare, List<String> senzori) {
        this.tip = tip;
        this.protocolConectare = protocolConectare;
        this.senzori = senzori;
    }

    public TipuriDispozitiv getTip() {
        return tip;
    }

    public String getProtocolConectare() {
        return protocolConectare;
    }

    public List<String> getSenzori() {
        return senzori;
    }

    public int getNumarSenzori() {
        return this.senzori.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dispozitiv{");
        sb.append("\n\ttip=").append(tip);
        sb.append(",\n\t protocolConectare = '").append(protocolConectare).append('\'');
        sb.append(",\n\t nr. senzori = ").append(this.getNumarSenzori());
        sb.append(",\n\t senzori = ").append(senzori);
        sb.append("\n}");
        return sb.toString();
    }
}
