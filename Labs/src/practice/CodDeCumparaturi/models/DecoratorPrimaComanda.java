package practice.CodDeCumparaturi.models;

public class DecoratorPrimaComanda extends ADecorator {
    private Client client;

    public DecoratorPrimaComanda(IComanda comanda, Client client) {
        super(comanda);
        this.client = client;
    }

    @Override
    public double calculareValoareComanda() {
        double valoareaInitiala = super.calculareValoareComanda();
        if (client.numarComenziPlasate() == 0) {
            return valoareaInitiala * 0.9;
        }
        return valoareaInitiala;
    }
}
