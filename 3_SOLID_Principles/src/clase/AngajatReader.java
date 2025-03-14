package clase;

import java.util.Scanner;

public class AngajatReader extends AplicantReader<Angajat> {
    @Override
    protected Angajat createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input) {
        int salariu = input.nextInt();
        String ocupatie = input.next().trim();
        return new Angajat(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, salariu, ocupatie);
    }
}
