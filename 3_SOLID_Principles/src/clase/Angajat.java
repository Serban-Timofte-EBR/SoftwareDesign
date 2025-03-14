package clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
    private String ocupatie;
    private int salariu;

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    @Override
    public int finantare() {
        return 10;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}
