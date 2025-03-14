package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
    private int clasa;
    private String tutore;

    public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    @Override
    public int finantare() {
        return 30;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev{");
        sb.append("clasa=").append(clasa);
        sb.append(", tutore='").append(tutore).append('\'');
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
