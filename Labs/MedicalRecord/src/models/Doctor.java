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
        return "Doctor{" + "idDoctor='" + idDoctor + '\'' + '}';
    }

    @Override
    public List<Appointment> getSelfAppointments(Hospital hospital) {
        return hospital.getHospitalAppointments().stream()
                .filter(appointment -> appointment.getDoctor().equals(this))
                .collect(Collectors.toList());
    }

    @Override
    public String recordDiagnostic(String appointmentId, Date appointmentDate, String diagnosis, Hospital hospital) {
        Optional<Appointment> appointmentOpt = getSelfAppointments(hospital).stream()
                .filter(appointment -> appointment.getAppointmentId().equals(appointmentId))
                .findFirst();

        if (appointmentOpt.isPresent()) {
            Appointment appointment = appointmentOpt.get();
            appointment.setDiagnosis(diagnosis);
            return "Diagnosticul a fost setat cu succes pentru pacientul " + appointment.getPatient().getName() + " pentru programarea cu ID " + appointment.getAppointmentId();
        } else {
            return "Programarea cu ID " + appointmentId + " nu a fost gasita in lista doctorului cu ID " + idDoctor;
        }
    }
}
