package practice.MagazinPantofi.models;

public abstract class Filtru implements ICautare{
    protected Filtru nextHandler;

    public void setNextHandler(Filtru nextHandler) {
        this.nextHandler = nextHandler;
    }
}
