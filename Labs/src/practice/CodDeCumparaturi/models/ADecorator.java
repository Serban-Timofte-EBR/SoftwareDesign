package practice.CodDeCumparaturi.models;

public abstract class ADecorator implements IComanda {
    private IComanda comanda;

    public ADecorator(IComanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public double calculareValoareComanda() {
        return comanda.calculareValoareComanda();
    }
}
