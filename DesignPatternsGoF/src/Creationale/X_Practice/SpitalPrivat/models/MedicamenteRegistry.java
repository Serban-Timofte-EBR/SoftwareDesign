package Creationale.X_Practice.SpitalPrivat.models;

import java.util.*;

public class MedicamenteRegistry {
    private static Map<Diagnostice, List<String>> registry = new HashMap<>();

    private MedicamenteRegistry() {
    }

    static {
        registry.put(Diagnostice.COVID19, new ArrayList<>(Arrays.asList(
                "Ibuprofen", "Paracetamol", "Aspirina"
        )));
        registry.put(Diagnostice.DIABET, new ArrayList<>(Arrays.asList(
                "Zahăr", "Sirop de porumb", "Sucuri carbogazoase"
        )));
        registry.put(Diagnostice.ASM, new ArrayList<>(Arrays.asList(
                "Polen", "Praf", "Fum de tigara"
        )));
    }

    public static List<String> getMedicamenteInterzise(Diagnostice diagnostic) {
        return registry.get(diagnostic);
    }

    public static void addMedicamentInterzis(Diagnostice diagnostic, String medicament) {
        List<String> medicamenteInterzise = getMedicamenteInterzise(diagnostic);
        medicamenteInterzise.add(medicament);
    }
}
