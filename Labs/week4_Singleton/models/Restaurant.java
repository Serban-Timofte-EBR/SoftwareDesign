package week4_Singleton.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    // Eager inseamna sa aplezi constructorul la initializare -> avantaj la multithreading
    // private static Restaurant instance = new Restaurant();
    private static Restaurant instance;
    private  String denumire;

    // Singleton data -> non-static (datele carate de unicul restaurant)
    private List<Masa> listaMese;

    private Restaurant() {
        this.listaMese = new ArrayList<>();
    }

    // Accesam instanta noastra, adica unicul obiect
        // Evitam trimiterea de parametrii in getInstance pentru ca ajungem sa avem mai multe proiecte
    public static Restaurant getInstance() {
        // Lazy Initialization
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("listaMese=").append(listaMese);
        sb.append('}');
        return sb.toString();
    }

    // Singleton methods + operations
    public Masa getMasa(boolean esteAfara, int nrPers) {    // Daca metoda este statica atunci si listaMese trebuie sa fie statica (nerecomandat)
        for (Masa masa : listaMese) {
            if (masa.getNrScaune() >= nrPers && masa.isAfara() == esteAfara) {
                return masa;
            }
        }
        return null;
    }

    public void addMasa(Masa masa) {
        this.listaMese.add(masa);
    }
}
