package Creationale.X_Practice.Bar.models;

public enum DificultatePreparare {
    MICA(1),
    MEDIE(2),
    MARE(3);

    private int dificultate;

    DificultatePreparare(int dificultate) {
        this.dificultate = dificultate;
    }

    public int getDificultate() {
        return dificultate;
    }
}
