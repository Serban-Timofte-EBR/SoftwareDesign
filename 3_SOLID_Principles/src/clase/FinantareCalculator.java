package clase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FinantareCalculator {
    private final String filename;
    private final Map<String, Integer> grilaSalariala = new HashMap<String, Integer>();

    public FinantareCalculator(String filename) {
        this.filename = filename;
        citesteReguliDinFisier(filename);
    }

    private void citesteReguliDinFisier(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                String[] parts = linie.split("=");
                if (parts.length == 2) {
                    grilaSalariala.put(parts[0].trim(), Integer.parseInt(parts[1].trim()));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Eroare la citirea fișierului de finanțare: " + e.getMessage());
        }
    }

    public int calculeazFinantarea(Aplicant aplicant) {
        return grilaSalariala.getOrDefault(aplicant.getClass().getSimpleName(), 0);
    }
}
