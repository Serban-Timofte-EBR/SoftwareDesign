package Creationale.X_Practice.Cafea.models;

import java.util.ArrayList;
import java.util.List;

public class CafeaFactory implements IFactory{
    private TipCafea tipCafea;
    private TipLapte tipLapte;
    private List<String> listaArome = new ArrayList<>();
    private boolean extraShot;

    public CafeaFactory(TipCafea tipCafea, TipLapte tipLapte, List<String> listaArome, boolean extraShot) {
        this.tipCafea = tipCafea;
        this.tipLapte = tipLapte;
        this.listaArome = listaArome;
        this.extraShot = extraShot;
    }

    @Override
    public AbstractCafeaMaker createNewCoffe() {
        return new Cafea(tipCafea, tipLapte, listaArome, extraShot);
    }
}
