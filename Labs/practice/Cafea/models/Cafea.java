package Creationale.X_Practice.Cafea.models;

import java.util.ArrayList;
import java.util.List;

public class Cafea implements AbstractCafeaMaker{
    private TipCafea tipCafea;
    private TipLapte tipLapte;
    private List<String> listaArome = new ArrayList<>();
    private boolean extraShot;

    Cafea(TipCafea tipCafea, TipLapte tipLapte, List<String> listaArome, boolean extraShot) {
        this.tipCafea = tipCafea;
        this.tipLapte = tipLapte;
        this.listaArome = listaArome;
        this.extraShot = extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public void setListaArome(List<String> listaArome) {
        this.listaArome = listaArome;
    }

    public void addAroma(String aroma) {
        this.listaArome.add(aroma);
    }

    public void setTipLapte(TipLapte tipLapte) {
        this.tipLapte = tipLapte;
    }

    public void setTipCafea(TipCafea tipCafea) {
        this.tipCafea = tipCafea;
    }

    @Override
    public AbstractCafeaMaker prepareCoffee() {
        try {
            Cafea clona = (Cafea) super.clone();
            clona.listaArome = new ArrayList<>(this.listaArome);
            return clona;
        } catch (CloneNotSupportedException e) {
            System.out.println("[ERROR]: Clonarea nu este suportata");
            return null;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("\n\t tipCafea=").append(tipCafea);
        sb.append(",\n\t tipLapte=").append(tipLapte);
        sb.append(",\n\t listaArome=").append(listaArome);
        sb.append(",\n\t extraShot=").append(extraShot);
        sb.append("\n}");
        return sb.toString();
    }
}
