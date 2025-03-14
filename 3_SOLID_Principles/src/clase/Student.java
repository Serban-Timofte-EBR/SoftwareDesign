package clase;

import java.util.Arrays;

public class Student extends Aplicant {
    private String facultate;
    private int anStudii;

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", anStudii=").append(anStudii);
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
