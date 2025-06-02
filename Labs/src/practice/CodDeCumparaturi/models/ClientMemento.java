package practice.CodDeCumparaturi.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento class for storing the state of a Client
 */
public class ClientMemento {
    private List<IComanda> comenziSalvate;

    /**
     * Constructor that takes a list of orders to save
     * @param comenzi The list of orders to save
     */
    public ClientMemento(List<IComanda> comenzi) {
        this.comenziSalvate = new ArrayList<>(comenzi);
    }

    /**
     * Get the saved list of orders
     * @return The saved list of orders
     */
    public List<IComanda> getComenziSalvate() {
        return comenziSalvate;
    }
}