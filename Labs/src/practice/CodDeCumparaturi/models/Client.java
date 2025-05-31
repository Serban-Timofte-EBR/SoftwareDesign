package practice.CodDeCumparaturi.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<IComanda> comenzi = new ArrayList<>();

    public int numarComenziPlasate() {
        return this.comenzi.size();
    }

    public List<IComanda> getComenzi() {
        return this.comenzi;
    }

    public void plaseazaComanda(IComanda comanda) {
        this.comenzi.add(comanda);
        System.out.println("Comanda plasata cu succes!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("comenzi=").append(comenzi);
        sb.append('}');
        return sb.toString();
    }
}
