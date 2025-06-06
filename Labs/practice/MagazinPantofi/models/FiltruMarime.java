package practice.MagazinPantofi.models;

import java.util.List;

public class FiltruMarime extends Filtru {
    @Override
    public List<Pantof> filtreare(List<Pantof> pantofi) {
        System.out.println("======= Filtrare dupa marime ========");
        if (pantofi.isEmpty()) {
            System.out.println("\tNu avem pantofi in magazin!");
            return pantofi;
        }

        List<Pantof> pantofiFiltrati = pantofi.stream()
                .filter(pantof -> pantof.getSize() > 36)
                .toList();

        System.out.println("\tAm gasit " + pantofiFiltrati.size() + " pantofi cu marimea mai mare ca 36");

        if (super.nextHandler != null) {
            return super.nextHandler.filtreare(pantofiFiltrati);
        }

        return pantofiFiltrati;
    }
}
