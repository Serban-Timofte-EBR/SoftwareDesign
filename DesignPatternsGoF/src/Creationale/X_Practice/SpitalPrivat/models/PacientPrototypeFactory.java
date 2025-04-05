package Creationale.X_Practice.SpitalPrivat.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PacientPrototypeFactory implements IFactory {
    private static Map<Diagnostice, Pacient> patientPrototipes = new HashMap<>();

    static {
        patientPrototipes.put(Diagnostice.COVID19, new Pacient(
                Diagnostice.COVID19,
                MedicamenteRegistry.getMedicamenteInterzise(Diagnostice.COVID19),
                "Dorel Ionescu",
                Arrays.asList("Terapie Intensiva", "Recuperare")
        ));
        patientPrototipes.put(Diagnostice.ASM, new Pacient(
                Diagnostice.ASM,
                MedicamenteRegistry.getMedicamenteInterzise(Diagnostice.ASM),
                "Gianina Vasilescu",
                Arrays.asList("Aerosoli", "Evitarea mediilor poluate")
        ));
        patientPrototipes.put(Diagnostice.DIABET, new Pacient(
                Diagnostice.DIABET,
                MedicamenteRegistry.getMedicamenteInterzise(Diagnostice.DIABET),
                "Ionescu Pop",
                Arrays.asList("Cura de insulina", "Stil de viata activ")
        ));
    }

    @Override
    public Pacient createNewPatient(String nume, Diagnostice diagnostic) {
        Pacient clona = (Pacient) patientPrototipes.get(diagnostic).clonePatient();
        clona.setNume(nume);
        return clona;
    }
}
