package week3_SOLID.clase;

public class Manager extends Angajat{
    public Manager(String nume) {
        super(nume);
    }

    @Override
    public float calculatorSalariu() {
        return 100;
    }
}
