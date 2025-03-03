package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Doctor extends Person implements IMedicalRecord {
    private final String idDoctor;
    private List<Appointment> appointments;

    public Doctor(String name, int age, String idDoctor) {
        super(name, age);
        this.idDoctor = idDoctor;
        appointments = new ArrayList<>();
    }

    public Doctor(String idDoctor) {
        this.idDoctor = idDoctor;
        appointments = new ArrayList<>();
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doctor{");
        sb.append("idDoctor='").append(idDoctor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<Appointment> getSelfAppointments(Hospital hospital) {
        List<Appointment> hospitalAppointments = hospital.getHospitalAppointments();
        return hospitalAppointments.stream().filter(appointment -> appointment.getDoctor().equals(idDoctor)).collect(Collectors.toList());
    }

    @Override
    public String recordDiagnostic(String appointmentId, Date appointmentDate, String diagnosis, Hospital hospital) {
        List<Appointment> selfAppointments = getSelfAppointments(hospital);

        Optional<Appointment> appointmentOpt = selfAppointments.stream()
                .filter(appointment -> appointment.getAppointmentId().equals(appointmentId))
                .findFirst();

        if (appointmentOpt.isPresent()) {
            Appointment appointment = appointmentOpt.get();
            appointment.setDiagnosis(diagnosis);
            return "Diagnosis recorded successfully.";
        } else {
            return "Appointment not found.";
        }
    }
}
