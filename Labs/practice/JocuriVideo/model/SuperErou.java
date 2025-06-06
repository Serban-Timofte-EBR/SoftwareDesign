package Creationale.X_Practice.JocuriVideo.model;

import java.util.ArrayList;
import java.util.List;

public class SuperErou implements Personaj{
    List<String> mesajeVocale = new ArrayList<>();
    private Pozitie pozitie;

    SuperErou(Pozitie pozitie) {
        this.pozitie = pozitie;
    }

    SuperErou(List<String> mesajeVocale, Pozitie pozitie) {
        this.mesajeVocale = mesajeVocale;
        this.pozitie = pozitie;
    }

    public void adaugaMesajVocal(String mesaj) {
        mesajeVocale.add(mesaj);
    }

    @Override
    public void spuneCeva() {
        if (mesajeVocale.isEmpty()) {
            System.out.println("Animalul nu are mesaje vocale.");
        }

        int index = (int) (Math.random() * mesajeVocale.size());
        System.out.println("Animalul " + Animal.class.getSimpleName() + " spune: " + mesajeVocale.get(index));
    }

    @Override
    public boolean verificaProximititate() {
        return false;
    }

    @Override
    public Pozitie getPozitie() {
        return this.pozitie;
    }

    @Override
    public void setPozitie(Pozitie pozitie) {
        this.pozitie = pozitie;
    }

    @Override
    public Personaj clonePesonaj() {
        SuperErou erou = new SuperErou(this.pozitie);
        erou.mesajeVocale = new ArrayList<>(mesajeVocale);
        return erou;
    }

    @Override
    public List<String> getMesajeVocale() {
        return this.mesajeVocale;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n\tSuperErou{");
        sb.append("mesajeVocale=").append(mesajeVocale);
        sb.append(", pozitie=").append(pozitie);
        sb.append('}');
        return sb.toString();
    }
}
