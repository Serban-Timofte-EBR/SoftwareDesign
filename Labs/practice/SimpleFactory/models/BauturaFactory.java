package Creationale.SimpleFactory.models;

public class BauturaFactory {
    public Bautura comandaBautura(TipBautura tip) {
        return switch (tip) {
            case LATTE -> new LATTE();
            case ESPRESSO -> new ESPRESSO();
        };
    }
}
