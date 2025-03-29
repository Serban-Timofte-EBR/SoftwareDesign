package week5_Builder.models;

import java.util.List;

public class MagazinBuilder implements Build{
    private Magazin magazin;

    // Campuri obligatorii
    private String denumire = "";
    private double suprafata = -1;

    public MagazinBuilder() {
        this.magazin = new Magazin();
    }

    public MagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        this.magazin.setDenumire(denumire);
        return this;
    }

    public MagazinBuilder setSuprafata(double suprafata) {
        this.suprafata = suprafata;
        this.magazin.setSuprafata(suprafata);
        return this;
    }

    public MagazinBuilder setNrIntrari(int nrIntrari) {
        this.magazin.setNrIntrari(nrIntrari);
        return this;
    }

    public MagazinBuilder setTipPodea(TipPodea tipPodea) {
        this.magazin.setTipPodea(tipPodea);
        return this;
    }

    public MagazinBuilder setDecoratiuni(List<String> decoratiuni) {
        this.magazin.setDecoratiuni(decoratiuni);
        return this;
    }

    @Override
    public Magazin build() {
        if (this.denumire.isEmpty() || this.suprafata == -1) {
            System.out.println("Magazinul nou nu se poate construit fara denumire, suprafata si numar intrari");
            return null;
        }

        int nrMinIntrari = (int) Math.ceil(this.suprafata / 100);
        if (this.magazin.getNrIntrari() < nrMinIntrari) {
            System.out.println("Trebuie sa existe cel putin 1 intrare la 100mp");
            return null;
        }
        Magazin buildedMagazin = this.magazin.clone();
        this.magazin = new Magazin();
        return buildedMagazin;
    }
}
