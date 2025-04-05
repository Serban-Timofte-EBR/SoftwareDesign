package Creationale.X_Practice.LivrariVehicule.models;

import java.util.ArrayList;
import java.util.List;

public class RegistruLivrari {
    private static RegistruLivrari instance;
    private List<Livrare> livrari;

    private RegistruLivrari() {
        livrari = new ArrayList<>();
    }

    public static synchronized RegistruLivrari getInstance() {
        if (instance == null) {
            instance = new RegistruLivrari();
        }
        return instance;
    }

    public void adaugaLivrare(Livrare livrare) {
        livrari.add(livrare);
    }

    public void afiseazaLivrari() {
        livrari.forEach(l -> System.out.println(l));
    }
}
