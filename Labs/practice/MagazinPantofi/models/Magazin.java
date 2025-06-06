package practice.MagazinPantofi.models;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    public static List<Pantof> stocPantofi = new ArrayList<>();

    static {
        stocPantofi.add(new Pantof(450, "piele", "Nike", 42));
        stocPantofi.add(new Pantof(350, "textil", "Adidas", 40));
        stocPantofi.add(new Pantof(600, "piele intoarsa", "Puma", 38));
        stocPantofi.add(new Pantof(520, "piele", "Reebok", 37));
        stocPantofi.add(new Pantof(250, "textil", "New Balance", 43));
        stocPantofi.add(new Pantof(180, "material sintetic", "Fila", 39));
        stocPantofi.add(new Pantof(1200, "piele naturala", "Gucci", 41));
    }

    public static List<Pantof> filtrare(
            boolean activFiltruPret,
            boolean activFiltruMarime,
            boolean schimbaOrdinea
    ) {
        List<Filtru> ordineFiltre = new ArrayList<>();

        if (schimbaOrdinea) {
            ordineFiltre.add(new FiltruMarime());
            ordineFiltre.add(new FiltruPret());
        } else {
            ordineFiltre.add(new FiltruPret());
            ordineFiltre.add(new FiltruMarime());
        }

        Filtru lantActiv = null;
        Filtru curr = null;

        for (Filtru filtru : ordineFiltre) {
            if (lantActiv == null) {
                lantActiv = filtru;
                curr = filtru;
            } else {
                curr.setNextHandler(filtru);
                curr = filtru;
            }
        }

        if (lantActiv != null) {
            return lantActiv.filtreare(stocPantofi);
        }

        return stocPantofi;
    }
}
