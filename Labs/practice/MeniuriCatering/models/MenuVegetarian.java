package Creationale.X_Practice.MeniuriCatering.models;

import java.util.List;

public class MenuVegetarian implements Menu {
    private List<String> feluriPrincipale;
    private List<String> deserturi;
    private List<String> bauturi;
    private final int timpPrepararePerPersoana = 5; // 5 min/pers
    public static int nrPersoane;

    MenuVegetarian() {
        this.feluriPrincipale = List.of("Burger vegetarian", "Salată de quinoa");
        this.deserturi = List.of("Tartă cu fructe", "Sorbet de mango");
        this.bauturi = List.of("Smoothie verde", "Apă plată");
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
