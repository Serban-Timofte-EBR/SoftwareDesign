package week5_Builder.models;

import java.util.ArrayList;
import java.util.List;

public class Magazin implements Cloneable{
    private String denumire;
    private double suprafata;
    private int nrIntrari = 1;
    private TipPodea tipPodea = TipPodea.STANDARD;
    private List<String> decoratiuni;

    public Magazin() {
        this.nrIntrari = 1;
        this.decoratiuni = new ArrayList<>();
    }

    public Magazin(String denumire, double suprafata, int nrIntrari, TipPodea tipPodea, List<String> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.tipPodea = tipPodea;
        this.decoratiuni = decoratiuni;
    }

    public int getNrIntrari() {
        return nrIntrari;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public void setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
    }

    public void setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
    }

    public void setDecoratiuni(List<String> decoratiuni) {
        this.decoratiuni = decoratiuni;
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

    @Override
    public Magazin clone() {
        try {
            Magazin clone = (Magazin) super.clone();
            clone.decoratiuni = new ArrayList<>(decoratiuni);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
