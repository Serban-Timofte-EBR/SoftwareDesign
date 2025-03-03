package models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nurse extends Person {
    private final String idNurse;
    private List<String> administeredTreatments;

    public Nurse(String name, int age, String idNurse) {
        super(name, age);
        this.idNurse = idNurse;
        this.administeredTreatments = new ArrayList<>();
    }

    public String getIdNurse() {
        return idNurse;
    }

    public List<String> getAdministeredTreatments() {
        return administeredTreatments;
    }

    public void administerTreatment(String patientId, String treatment) {
        administeredTreatments.add("Patient " + patientId + " received treatment: " + treatment);
    }

    public List<Appointment> viewAppointments(Hospital hospital) {
        return hospital.getHospitalAppointments();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nurse{");
        sb.append("idNurse='").append(idNurse).append('\'');
        sb.append(", administeredTreatments=").append(administeredTreatments);
        sb.append('}');
        return sb.toString();
    }
}