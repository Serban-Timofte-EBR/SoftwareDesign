package Creationale.X_Practice.JocuriVideo.model;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Personaj{
    List<String> mesajeVocale = new ArrayList<>();
    private Pozitie pozitie;

    Animal(Pozitie pozitie) {
        this.pozitie = pozitie;
    }

    Animal(List<String> mesajeVocale, Pozitie pozitie) {
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
        Animal animal = new Animal(this.pozitie);
        animal.mesajeVocale = new ArrayList<>(mesajeVocale);
        return animal;
    }

    @Override
    public List<String> getMesajeVocale() {
        return this.mesajeVocale;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n\tAnimal{");
        sb.append("mesajeVocale=").append(mesajeVocale);
        sb.append(", pozitie=").append(pozitie);
        sb.append('}');
        return sb.toString();
    }
}
