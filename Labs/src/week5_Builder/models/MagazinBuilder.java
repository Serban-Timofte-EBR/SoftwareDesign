package week5_Builder.models;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements Build {
    private String denumire = "";
    private double suprafata = -1;
    private int nrIntrari = 1;
    private TipPodea tipPodea = TipPodea.MOCHETA;
    private List<String> decoratiuni = new ArrayList<>();

    public MagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    public MagazinBuilder setSuprafata(double suprafata) {
        this.suprafata = suprafata;
        return this;
    }

    public MagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    public MagazinBuilder setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
        return this;
    }

    @Override
    public Magazin build() {
        if (denumire.isEmpty() || suprafata <= 0) {
            System.out.println("[ERROR]: Denumirea și suprafața sunt obligatorii.");
            return null;
        }

        int intrariMinime = (int) Math.ceil(suprafata / 100);
        if (nrIntrari < intrariMinime) {
            System.out.println("[ERROR]: Magazinul trebuie să aibă cel puțin 1 intrare la 100mp.");
            return null;
        }

        if (tipPodea.getDuritate() < 2 && decoratiuni.stream().anyMatch(d -> d.equalsIgnoreCase("sticla"))) {
            System.out.println("[ERROR]: Podeaua moale nu permite decoratiuni din sticla.");
            return null;
        }

        Magazin magazin = new Magazin(denumire, suprafata, nrIntrari, tipPodea, decoratiuni);

        this.denumire = "";
        this.suprafata = -1;
        this.nrIntrari = 1;
        this.tipPodea = TipPodea.MOCHETA;
        this.decoratiuni = new ArrayList<>();

        return magazin;
    }
}