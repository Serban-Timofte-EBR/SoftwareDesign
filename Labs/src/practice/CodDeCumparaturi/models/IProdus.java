package practice.CodDeCumparaturi.models;

public interface IProdus {
    String getDenumire();
    int getPret();

    void adaugareProdus(IProdus produs);
    void stergeProdus(IProdus produs);
    void getProdus(IProdus produs);

    void afisare(int nivelIndentare)
}
