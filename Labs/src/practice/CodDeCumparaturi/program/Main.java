package practice.CodDeCumparaturi.program;

import practice.CodDeCumparaturi.models.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        IComanda comanda1 = new DecoratorPrimaComanda(new Comanda(100, "Str. Florilor 10"), client);
        double total1 = comanda1.calculareValoareComanda();
        client.plaseazaComanda(comanda1);
        System.out.println("Total prima comanda: " + total1 + "\n");

        IComanda comanda2 = new Comanda(200, "Str. Lalelelor 21");
        IComanda comandaDecorata2 = new DecoratorPrimaComanda(comanda2, client);
        double total2 = comandaDecorata2.calculareValoareComanda();
        client.plaseazaComanda(comanda2);
        System.out.println("Total a doua comanda: " + total2);
    }
}
