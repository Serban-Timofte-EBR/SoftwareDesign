package Creationale.X_Practice.JocuriVideo.model;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private static Canvas instance;
    private PersonajFactory factory = new PersonajFactory();

    List<Personaj> personaje = new ArrayList<>();

    private Canvas() {
    }

    public static synchronized Canvas getInstance() {
        if (instance == null) {
            instance = new Canvas();
        }
        return instance;
    }

    public void adaugaPersonaj(String tipPersonaj, ChangePozitionValidator changer) {
        Personaj personaj = factory.getPersonaj(tipPersonaj);
        if (changer.change()) {
            personaj.setPozitie(changer.pozitie());
        }
        personaje.add(personaj);
    }

    public List<Personaj> getPersonaje() {
        return this.personaje;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Canvas{");
        sb.append("personaje=").append(personaje);
        sb.append('}');
        return sb.toString();
    }
}
