package week3_SOLID.clase;

public abstract class Angajat {
    String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    // printr-o metoda abstracta avem O, dar incalcam S
    public abstract float calculatorSalariu();
}
