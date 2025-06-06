package Creationale.X_Practice.SpitalPrivat.models;

import java.util.ArrayList;
import java.util.List;

public class Pacient implements AbstractPacientProfile{
    private String nume;
    private Diagnostice diagnostic;
    private List<String> tratamente;
    private List<String> medicamenteInterzise;

    Pacient(Diagnostice diagnostic, List<String> medicamenteInterzise, String nume, List<String> tratamente) {
        this.diagnostic = diagnostic;
        this.medicamenteInterzise = medicamenteInterzise;
        this.nume = nume;
        this.tratamente = tratamente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void addTratament(String tratament) {
        this.tratamente.add(tratament);
    }

    public void notificaMedicamentInterzis(String medicament) {
        MedicamenteRegistry.addMedicamentInterzis(this.diagnostic, medicament);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("diagnostic=").append(diagnostic);
        sb.append(",\n\t nume='").append(nume).append('\'');
        sb.append(",\n\t tratamente=").append(tratamente);
        sb.append(",\n\t medicamenteInterzise=").append(medicamenteInterzise);
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public AbstractPacientProfile clonePatient() {
        try {
            Pacient pacient = (Pacient) super.clone();
            pacient.tratamente = new ArrayList<>(tratamente);
            pacient.medicamenteInterzise = medicamenteInterzise;
            return pacient;
        } catch (CloneNotSupportedException e) {
            System.out.println("[ERROR]: Pacientul nu poate sa fie clonat: " + e.getMessage());
            return null;
        }
    }
}
