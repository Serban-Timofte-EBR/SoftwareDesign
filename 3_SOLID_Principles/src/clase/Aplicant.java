package clase;

import java.util.Arrays;

public abstract class Aplicant implements IPersonalData {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    @Override
    public String getNume() { return nume; }

    @Override
    public String getPrenume() { return prenume; }

    @Override
    public int getVarsta() { return varsta; }

    @Override
    public int getPunctaj() { return punctaj; }

    @Override
    public int getNrProiecte() { return nrProiecte; }

    @Override
    public String toString() {
        return "Aplicant{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                '}';
    }
}
