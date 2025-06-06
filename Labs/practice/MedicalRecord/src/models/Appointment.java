package models;

import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Date date;
    private Doctor doctor;
    private Patient patient;
    private String diagnosis;

    public Appointment(String appointmentId, Date date, Doctor doctor, Patient patient) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.diagnosis = "";
    }

    public Appointment() {
        this.appointmentId = "";
        this.date = new Date();
        this.doctor = null;
        this.patient = null;
        this.diagnosis = "";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Appointment{");
        sb.append("date=").append(date);
        sb.append(", doctor=").append(doctor);
        sb.append(", patient=").append(patient);
        sb.append('}');
        return sb.toString();
    }
}
