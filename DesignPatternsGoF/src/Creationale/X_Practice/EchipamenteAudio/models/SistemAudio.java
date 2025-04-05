package Creationale.X_Practice.EchipamenteAudio.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemAudio {
    private List<TipEchipament> tipEchipament;
    private int numarEchipamente;
    private float putereTotala;

    SistemAudio(int numarEchipamente, float putereTotala, List<TipEchipament> tipEchipament) {
        this.numarEchipamente = numarEchipamente;
        this.putereTotala = putereTotala;
        this.tipEchipament = tipEchipament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SistemAudio{");
        sb.append("numarEchipamente=").append(numarEchipamente);
        sb.append(", tipEchipament=").append(tipEchipament);
        sb.append(", putereTotala=").append(putereTotala);
        sb.append('}');
        return sb.toString();
    }
}
