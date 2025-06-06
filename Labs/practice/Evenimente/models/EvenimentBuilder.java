package Creationale.X_Practice.Evenimente.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EvenimentBuilder implements IBuilder {
    private static final Map<TipEveniment, List<String>> DECORURI_DEFAULT = Map.of(
            TipEveniment.NUNTA, List.of("Lumanari", "Artificii", "Ring de dans"),
            TipEveniment.CONFERINTA, List.of("FlipChart", "Banner", "Videoproiector"),
            TipEveniment.ANIVERSARE, List.of("Clovn", "Baloane", "Flori")
    );

    private Sala sala;
    private TipEveniment tipEveniment;
    private List<String> decoratiuni = new ArrayList<>();

    public EvenimentBuilder(TipEveniment tipEveniment) {
        this.tipEveniment = tipEveniment;
        List<String> decoratiuni = DECORURI_DEFAULT.getOrDefault(tipEveniment, null);
        this.decoratiuni = new ArrayList<>(decoratiuni);
    }

    public EvenimentBuilder addDecoratiuni(String decoratiune) {
        this.decoratiuni.add(decoratiune);
        return this;
    }

    public EvenimentBuilder setSala(String sala) {
        this.sala = Sala.getSala(sala);
        Sala.getSala(sala).adaugaEveniment();
        return this;
    }

    @Override
    public Eveniment build() {
        Eveniment eveniment = new Eveniment(this.sala, this.decoratiuni, this.tipEveniment);

        this.sala = null;
        this.decoratiuni = new ArrayList<>(DECORURI_DEFAULT.get(this.tipEveniment));

        return eveniment;
    }
}
