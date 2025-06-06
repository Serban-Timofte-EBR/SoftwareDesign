package Creationale.X_Practice.EchipamenteAudio.models;

public enum TipEchipament {
    MICROFON(10),
    BOXA(50),
    MIXER(5),
    AMPLIFICATOR(20);

    private int putereEchipament;

    TipEchipament(int putereEchipament) {
        this.putereEchipament = putereEchipament;
    }

    public int getPutereEchipament() {
        return this.putereEchipament;
    }
}
