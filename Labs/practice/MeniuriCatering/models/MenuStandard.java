package Creationale.X_Practice.MeniuriCatering.models;

import java.util.List;

public class MenuStandard implements Menu {
    private List<String> feluriPrincipale;
    private List<String> deserturi;
    private List<String> bauturi;
    private final int timpPrepararePerPersoana = 7; // 7 min/pers
    public static int nrPersoane;

    MenuStandard() {
        this.feluriPrincipale = List.of("Piept de pui la grătar", "Paste carbonara");
        this.deserturi = List.of("Înghețată", "Plăcintă cu mere");
        this.bauturi = List.of("Apă minerală", "Suc natural");
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
