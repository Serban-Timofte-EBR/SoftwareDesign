package clase;

import java.util.Scanner;

public class StudentReader extends AplicantReader<Student> {
    @Override
    protected Student createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input) {
        int anStudii = input.nextInt();
        String facultate = input.next().trim();
        return new Student(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, facultate, anStudii);
    }
}
