package Creationale.X_Practice.Bar.models;

public class Bautura {
    private DificultatePreparare dificultate;
    private int timpPreparare;

    public Bautura(DificultatePreparare dificultate, int timpPreparare) {
        this.dificultate = dificultate;
        this.timpPreparare = timpPreparare;
    }

    public DificultatePreparare getDificultate() {
        return dificultate;
    }

    public int getTimpPreparare() {
        return timpPreparare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("dificultate=").append(dificultate);
        sb.append(", timpPreparare=").append(timpPreparare);
        sb.append("}\n\t");
        return sb.toString();
    }
}
