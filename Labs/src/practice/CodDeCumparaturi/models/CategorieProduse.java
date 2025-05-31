package practice.CodDeCumparaturi.models;

import java.util.ArrayList;
import java.util.List;

public class CategorieProduse implements IProdus {
    private String denumire;
    private List<Produs> listaProduse;

    public CategorieProduse(String denumire) {
        this.denumire = denumire;
        this.listaProduse = new ArrayList<>();
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getPret() {
        return (int) listaProduse.stream().mapToDouble(Produs::getPret).sum();
    }

    @Override
    public void adaugareProdus(IProdus produs) {
        listaProduse.add((Produs) produs);
    }

    @Override
    public void stergeProdus(IProdus produs) {
        listaProduse.remove(produs);
    }

    @Override
    public void getProdus(IProdus produs) {
        listaProduse.get(produs.getPret());
    }

    @Override
    public void afisare(int nivelIndentare) {
        System.out.println("Lista din categoria " + denumire + ":");
        listaProduse.forEach(System.out::println);
    }
}
