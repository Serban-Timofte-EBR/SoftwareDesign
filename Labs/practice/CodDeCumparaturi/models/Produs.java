package practice.CodDeCumparaturi.models;

public class Produs implements IProdus{
    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getPret() {
        return this.getPret();
    }

    @Override
    public void adaugareProdus(IProdus produs) {
        System.out.println("Nu se poate adauga un produs sub alt produs");
    }

    @Override
    public void stergeProdus(IProdus produs) {
        System.out.println("Nu se poate sterge un produs sub alt produs");
    }

    @Override
    public void getProdus(IProdus produs) {
        System.out.println("Nu se pot alege subprodusele unui produs");
    }

    @Override
    public void afisare(int nivelIndentare) {
        System.out.println("\t".repeat(nivelIndentare) + "- " + denumire + " (Pret: " + pret + ")");
    }
}
