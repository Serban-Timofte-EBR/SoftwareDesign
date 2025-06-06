package week5_Builder.models;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String denumire;
    private double suprafata;
    private int nrIntrari = 1;
    private TipPodea tipPodea = TipPodea.STANDARD;
    private List<String> decoratiuni;

    protected Magazin() {
        this.nrIntrari = 1;
        this.decoratiuni = new ArrayList<>();
    }

    protected Magazin(String denumire, double suprafata, int nrIntrari, TipPodea tipPodea, List<String> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.tipPodea = tipPodea;
        this.decoratiuni = decoratiuni;
    }

    public int getNrIntrari() {
        return nrIntrari;
    }

    public void adaugaDecoratiune(String decoratiune) {
        String decoratiuneSistem = decoratiune.trim().toLowerCase();
        if (decoratiuneSistem.equals("sticla") && this.tipPodea.getDuritate() < 2) {
            System.out.println("Nu se poate adauga sticla daca podeaua este moale");
            return;
        } else {
            this.decoratiuni.add(decoratiuneSistem);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", tipPodea='").append(tipPodea).append('\'');
        sb.append(", decoratiuni=").append(decoratiuni);
        sb.append('}');
        return sb.toString();
    }
}
