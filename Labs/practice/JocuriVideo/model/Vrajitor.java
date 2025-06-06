package Creationale.X_Practice.JocuriVideo.model;

import java.util.ArrayList;
import java.util.List;

public class Vrajitor implements Personaj {
    private List<String> mesajeVocale = new ArrayList<>();
    private Pozitie pozitie;

    Vrajitor(Pozitie pozitie) {
        this.pozitie = pozitie;
    }

    Vrajitor(List<String> mesajeVocale, Pozitie pozitie) {
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
        Canvas canvas = Canvas.getInstance();
        boolean found = false;

        for (Personaj other : canvas.getPersonaje()) {
            if (other == this) continue;

            Pozitie otherPos = other.getPozitie();
            if (isInProximitate(this.pozitie, otherPos)) {
                found = true;

                for (String msg : other.getMesajeVocale()) {
                    if (!this.mesajeVocale.contains(msg)) {
                        this.mesajeVocale.add(msg);
                        System.out.println("[VRAJITOR] A preluat un mesaj: " + msg);
                        break;
                    }
                }
            }
        }

        return found;
    }

    private boolean isInProximitate(Pozitie p1, Pozitie p2) {
        return Math.abs(p1.getX() - p2.getX()) <= 1 && Math.abs(p1.getY() - p2.getY()) <= 1;
    }

    @Override
    public Pozitie getPozitie() {
        return this.pozitie;
    }

    @Override
    public void setPozitie(Pozitie pozitie) {
        this.pozitie = pozitie;
    }

    public List<String> getMesajeVocale() {
        return mesajeVocale;
    }

    @Override
    public Personaj clonePesonaj() {
        Vrajitor vrajitor = new Vrajitor(this.pozitie);
        vrajitor.mesajeVocale = this.mesajeVocale;
        return vrajitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n\tVrajitor{");
        sb.append("mesajeVocale=").append(mesajeVocale);
        sb.append(", pozitie=").append(pozitie);
        sb.append('}');
        return sb.toString();
    }
}
