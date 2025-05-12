package practice.MagazinPantofi.models;

import java.util.List;

public class FiltruPret extends Filtru{
    @Override
    public List<Pantof> filtreare(List<Pantof> pantofi) {
        System.out.println("======= Filtrare dupa pret ========");
        if (pantofi.isEmpty()) {
            System.out.println("\tNu avem pantofi in magazin!");
            return pantofi;
        }

        List<Pantof> pantofiFiltrati = pantofi.stream()
                .filter(pantof -> pantof.getPrice() < 500)
                .toList();

        System.out.println("\tAm gasit " + pantofiFiltrati.size() + " pantofi cu pret mai mic de 500");

        if (super.nextHandler != null) {
            return super.nextHandler.filtreare(pantofiFiltrati);
        }

        return pantofiFiltrati;
    }
}
