package Creationale.X_Practice.Evenimente.models;

import java.util.List;

public class Eveniment {
    private Sala sala;
    private TipEveniment tipEveniment;
    private List<String> decoratiuni;

    public Eveniment(Sala sala, List<String> decoratiuni, TipEveniment tipEveniment) {
        this.sala = sala;
        this.decoratiuni = decoratiuni;
        this.tipEveniment = tipEveniment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Eveniment{");
        sb.append("decoratiuni=").append(decoratiuni);
        sb.append(", sala='").append(sala).append('\'');
        sb.append(", tipEveniment=").append(tipEveniment);
        sb.append('}');
        return sb.toString();
    }
}
