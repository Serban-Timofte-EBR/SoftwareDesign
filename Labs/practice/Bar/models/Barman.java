package Creationale.X_Practice.Bar.models;

import java.security.DigestException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Barman {
//    private static Barman instance;
    private static Map<String, Barman> map = new HashMap<>();

    private String nume;
    private DificultatePreparare dificultateMaxima;
    private List<Bautura> comenzi;

    private Barman(String nume, DificultatePreparare dificultateMaxima) {
        this.nume = nume;
        this.dificultateMaxima = dificultateMaxima;
        this.comenzi = new ArrayList<>();
    }

    static {
        map.put("Ionel", new Barman("Ionel", DificultatePreparare.MEDIE));
        map.put("Vasile", new Barman("Vasile", DificultatePreparare.MICA));
        map.put("Ionela", new Barman("Ionela", DificultatePreparare.MARE));
    }

    public DificultatePreparare getDificultateMaxima() {
        return dificultateMaxima;
    }

    public int calculeazaTimpul() {
        int durata = 0;
        for (Bautura comanda: this.comenzi) {
            durata += comanda.getTimpPreparare();
        }
        return durata;
    }

    public void adaugaComanda(Bautura comanda) {
        this.comenzi.add(comanda);
    }

    public static void alocaComanda(Bautura comanda) {
        Barman barmanOptim = null;
        int timpMinim = Integer.MAX_VALUE;

        for (Barman barman : map.values()) {
            if (barman.dificultateMaxima.getDificultate() >= comanda.getDificultate().getDificultate()) {
                int timpCurent = barman.calculeazaTimpul();
                if (timpCurent < timpMinim) {
                    timpMinim = timpCurent;
                    barmanOptim = barman;
                }
            }
        }

        barmanOptim.adaugaComanda(comanda);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Barman{");
        sb.append("\n\tcomenzi=").append(comenzi);
        sb.append(",\n\t nume='").append(nume).append('\'');
        sb.append("\n}");
        return sb.toString();
    }
}
