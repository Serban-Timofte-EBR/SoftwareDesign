package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader<T extends Aplicant> {
    protected abstract T createAplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, Scanner input);

    public List<T> readAplicants(String filePath) {
        List<T> aplicanti = new ArrayList<>();
        try (Scanner input = new Scanner(new File(filePath))) {
            input.useDelimiter(",|\n");

            while (input.hasNext()) {
                try {
                    String nume = input.next().trim();
                    String prenume = input.next().trim();
                    int varsta = input.nextInt();
                    int punctaj = input.nextInt();
                    int nrProiecte = input.nextInt();

                    if (nrProiecte < 0 || nrProiecte > 10) {
                        System.err.println("Eroare: Nr. proiecte invalid pentru aplicant: " + nume + " " + prenume);
                        input.nextLine();
                        continue;
                    }

                    String[] denumireProiecte = new String[nrProiecte];
                    for (int i = 0; i < nrProiecte; i++) {
                        denumireProiecte[i] = input.next().trim();
                    }

                    T aplicant = createAplicant(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte, input);
                    aplicanti.add(aplicant);
                } catch (Exception e) {
                    System.err.println("Eroare la citirea unui aplicant. Linie ignorată.");
                    input.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return aplicanti;
    }
}
