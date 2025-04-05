package Creationale.X_Practice.EchipamenteAudio.models;

import java.util.ArrayList;
import java.util.List;

public class SistemAudioBuilder implements IBuilder{
    private List<TipEchipament> tipEchipament;
    private int numarEchipamente;
    private float putereTotala;

    public SistemAudioBuilder() {
        this.tipEchipament = new ArrayList<>();
    }

    public SistemAudioBuilder addEchipament(TipEchipament echipamentSelectat) {
        this.tipEchipament.add(echipamentSelectat);
        this.numarEchipamente++;
        this.putereTotala += echipamentSelectat.getPutereEchipament();
        return this;
    }


    @Override
    public SistemAudio buid() {
        SistemAudio sistemAudio = new SistemAudio(this.numarEchipamente, this.putereTotala, this.tipEchipament);

        this.tipEchipament = new ArrayList<>();
        this.numarEchipamente = 0;
        this.putereTotala = 0;

        return sistemAudio;
    }
}
