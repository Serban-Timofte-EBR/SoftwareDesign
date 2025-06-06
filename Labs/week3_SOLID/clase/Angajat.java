package week3_SOLID.clase;

public class Angajat implements ISalariedEmployee {
    protected String nume;
    protected float salariulDeBaza;
    protected float oreLucrate;
    protected float tarifPeOra;

    public Angajat(String nume, float salariulDeBaza, float oreLucrate, float tarifPeOra) {
        this.nume = nume;
        this.salariulDeBaza = salariulDeBaza;
        this.oreLucrate = oreLucrate;
        this.tarifPeOra = tarifPeOra;
    }

    public float getSalariulDeBaza() {
        return salariulDeBaza;
    }
    // printr-o metoda abstracta avem O, dar incalcam S. Clasa trebuia sa fie abstracta
//    public abstract float calculatorSalariu();

    @Override
    public float getOreLucrate() {
        return this.oreLucrate;
    }

    @Override
    public float getTarifPeOra() {
        return this.tarifPeOra;
    }
}
