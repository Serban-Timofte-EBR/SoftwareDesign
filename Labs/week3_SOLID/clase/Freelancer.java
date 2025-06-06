package week3_SOLID.clase;

public class Freelancer implements ISalariedEmployee{
    protected float oreLucrate;
    protected float tarifPeOra;

    public Freelancer(float oreLucrate, float tarifPeOra) {
        this.oreLucrate = oreLucrate;
        this.tarifPeOra = tarifPeOra;
    }

    @Override
    public float getOreLucrate() {
        return this.oreLucrate;
    }

    @Override
    public float getTarifPeOra() {
        return this.tarifPeOra;
    }
}
