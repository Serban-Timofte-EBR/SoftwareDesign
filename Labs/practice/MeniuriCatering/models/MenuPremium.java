package Creationale.X_Practice.MeniuriCatering.models;

import java.util.List;

public class MenuPremium implements Menu {
    private List<String> feluriPrincipale;
    private List<String> deserturi;
    private List<String> bauturi;
    private final int timpPrepararePerPersoana = 10; // 10 min/pers
    public static int nrPersoane;

    MenuPremium() {
        this.feluriPrincipale = List.of("Steak de vită", "Somon la grătar");
        this.deserturi = List.of("Tiramisu", "Cheesecake");
        this.bauturi = List.of("Vin roșu", "Șampanie");
        nrPersoane++;
    }

    @Override
    public List<String> getFeluriPrincipale() {
        return feluriPrincipale;
    }

    @Override
    public List<String> getDeserturi() {
        return deserturi;
    }

    @Override
    public List<String> getBauturi() {
        return bauturi;
    }

    @Override
    public int calculeazaTimpTotalPreparare(int nrPersoane) {
        return nrPersoane * timpPrepararePerPersoana;
    }
}
