package clase;

import java.util.Scanner;

public class ElevReader extends AplicantReader<Elev> {
    @Override
    protected Elev createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input) {
        int clasa = input.nextInt();
        String tutore = input.next().trim();
        return new Elev(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, clasa, tutore);
    }
}
