package practice.CodDeCumparaturi.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker class for managing Client mementos
 */
public class ClientCaretaker {
    private List<ClientMemento> mementos = new ArrayList<>();
    
    /**
     * Add a memento to the list
     * @param memento The memento to add
     */
    public void addMemento(ClientMemento memento) {
        mementos.add(memento);
        System.out.println("Client state saved. Memento index: " + (mementos.size() - 1));
    }
    
    /**
     * Get a memento from the list by index
     * @param index The index of the memento to get
     * @return The memento at the specified index
     */
    public ClientMemento getMemento(int index) {
        if (index >= 0 && index < mementos.size()) {
            System.out.println("Client state restored from memento index: " + index);
            return mementos.get(index);
        }
        System.out.println("Invalid memento index: " + index);
        return null;
    }
    
    /**
     * Get the number of mementos in the list
     * @return The number of mementos
     */
    public int getMementoCount() {
        return mementos.size();
    }
}