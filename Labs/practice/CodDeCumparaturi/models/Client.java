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

    /**
     * Create a memento containing the current state of the client
     * @return A new ClientMemento with the current state
     */
    public ClientMemento createMemento() {
        return new ClientMemento(this.comenzi);
    }

    /**
     * Restore the client's state from a memento
     * @param memento The memento to restore from
     */
    public void restoreFromMemento(ClientMemento memento) {
        if (memento != null) {
            this.comenzi = new ArrayList<>(memento.getComenziSalvate());
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("comenzi=").append(comenzi);
        sb.append('}');
        return sb.toString();
    }
}
