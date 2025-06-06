package Creationale.X_Practice.SmartHome.models;

import java.util.ArrayList;
import java.util.List;

public class DispozitivBuilder implements IBuilder{
    private TipuriDispozitiv tip;
    private String protocolConectare;
    private boolean resetSenzorsToEmpty;
    private List<String> senzori = new ArrayList<String>();
    private List<String> senzoriProtoype;

    public DispozitivBuilder(TipuriDispozitiv tip, String protocolConectare) {
        this.tip = tip;
        this.protocolConectare = protocolConectare;
        this.resetSenzorsToEmpty = true;
    }

    public DispozitivBuilder(Dispozitiv prototype) {
        this.tip = prototype.getTip();
        this.protocolConectare = prototype.getProtocolConectare();
        this.resetSenzorsToEmpty = false;
        this.senzori = new ArrayList<>(prototype.getSenzori());
        this.senzoriProtoype = prototype.getSenzori();
    }

    public DispozitivBuilder addSenzor(String senzor) {
        this.senzori.add(senzor);
        return this;
    }

    public DispozitivBuilder removeSenzor(String senzor) {
        this.senzori.remove(senzor);
        return this;
    }

    @Override
    public Dispozitiv build() {
        Dispozitiv built = new Dispozitiv(this.tip, this.protocolConectare, this.senzori);
        if (this.resetSenzorsToEmpty) {
            this.senzori = new ArrayList<String>();
        } else {
            this.senzori = new ArrayList<>(this.senzoriProtoype);
        }
        return built;
    }
}
