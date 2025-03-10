package week3_SOLID.clase;

public class Lucrator extends Angajat{
    public Lucrator(String nume) {
        super(nume);
    }

    @Override
    public float calculatorSalariu() {
        return 10;
    }
}
