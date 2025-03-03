package models;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Doctor> hospitalDoctors;
    private List<Appointment> hospitalAppointments;

    public Hospital(String hospitalName, List<Doctor> hospitalDoctors, List<Appointment> hospitalAppointments) {
        this.hospitalName = hospitalName;
        this.hospitalDoctors = hospitalDoctors;
        this.hospitalAppointments = hospitalAppointments;
    }

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.hospitalDoctors = new ArrayList<>();
        this.hospitalAppointments = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<Doctor> getHospitalDoctors() {
        return hospitalDoctors;
    }

    public void setHospitalDoctors(List<Doctor> hospitalDoctors) {
        this.hospitalDoctors = hospitalDoctors;
    }

    public List<Appointment> getHospitalAppointments() {
        return hospitalAppointments;
    }

    public void setHospitalAppointments(List<Appointment> hospitalAppointments) {
        this.hospitalAppointments = hospitalAppointments;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hospital{");
        sb.append("hospitalName='").append(hospitalName).append('\'');
        sb.append(", hospitalDoctors=").append(hospitalDoctors);
        sb.append(", hospitalAppointments=").append(hospitalAppointments);
        sb.append('}');
        return sb.toString();
    }

    public Doctor recordDoctor(String doctorName, int doctorAge, String doctorId) {
        Doctor doctor = new Doctor(doctorName, doctorAge, doctorId);
        hospitalDoctors.add(doctor);
        return doctor;
    }

    public Patient createPatient(String name, int age, String idPatient) {
        return new Patient(name, age, idPatient);
    }

    public Appointment scheduleAppointment(String appointmentId, Date date, Doctor doctor, Patient patient) {
        Appointment newAppointment = new Appointment(appointmentId, date, doctor, patient);
        hospitalAppointments.add(newAppointment);
        return newAppointment;
    }
}
