package practice.CodDeCumparaturi.program;

import practice.CodDeCumparaturi.models.*;

public class Main {
    public static void main(String[] args) {
        // Create a client and a caretaker
        Client client = new Client();
        ClientCaretaker caretaker = new ClientCaretaker();

        // Place the first order
        IComanda comanda1 = new DecoratorPrimaComanda(new Comanda(100, "Str. Florilor 10"), client);
        double total1 = comanda1.calculareValoareComanda();
        client.plaseazaComanda(comanda1);
        System.out.println("Total prima comanda: " + total1 + "\n");

        // Save the client's state after the first order
        caretaker.addMemento(client.createMemento());
        System.out.println("Client state after first order: " + client);

        // Place the second order
        IComanda comanda2 = new Comanda(200, "Str. Lalelelor 21");
        IComanda comandaDecorata2 = new DecoratorPrimaComanda(comanda2, client);
        double total2 = comandaDecorata2.calculareValoareComanda();
        client.plaseazaComanda(comanda2);
        System.out.println("Total a doua comanda: " + total2);
        System.out.println("Client state after second order: " + client);

        // Save the client's state after the second order
        caretaker.addMemento(client.createMemento());

        // Place a third order
        IComanda comanda3 = new Comanda(300, "Str. Trandafirilor 15");
        client.plaseazaComanda(comanda3);
        System.out.println("Client state after third order: " + client);

        // Restore the client's state to after the first order
        System.out.println("\nRestoring client state to after the first order...");
        client.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Client state after restoration: " + client);

        // Restore the client's state to after the second order
        System.out.println("\nRestoring client state to after the second order...");
        client.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Client state after restoration: " + client);
    }
}
