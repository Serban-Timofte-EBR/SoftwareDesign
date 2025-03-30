package Creationale.FactoryMethod.models;

public class LATTEFactory implements BauturaFactory{
    @Override
    public Bautura creareBautura() {
        return new LATTE();
    }
}
