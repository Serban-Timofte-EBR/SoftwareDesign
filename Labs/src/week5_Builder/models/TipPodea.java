package week5_Builder.models;

public enum TipPodea {
    LINOLEUM(2),
    PARCHET(4),
    LEMN_MASIV(6),
    PIATRA_NATURALA(8),
    GRESIE(7),
    CIMENT_POLIZAT(9),
    RASINA_EPOXIDICA(10),
    MOCHETA(1),
    STANDARD(1);

    private final int duritate;

    TipPodea(int duritate) {
        this.duritate = duritate;
    }

    public int getDuritate() {
        return duritate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TipPodea{");
        sb.append("tip=").append(name());
        sb.append("duritate=").append(duritate);
        sb.append('}');
        return sb.toString();
    }
}
