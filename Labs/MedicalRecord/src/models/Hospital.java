package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hospital {
    private static Hospital instance;
    private String hospitalName;
    private List<Doctor> hospitalDoctors;
    private List<Nurse> hospitalNurses;
    private List<Appointment> hospitalAppointments;

    private Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.hospitalDoctors = new ArrayList<>();
        this.hospitalNurses = new ArrayList<>();
        this.hospitalAppointments = new ArrayList<>();
    }

    public static Hospital getInstance(String hospitalName) {
        if (instance == null) {
            instance = new Hospital(hospitalName);
        }
        return instance;
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

    public List<Nurse> getHospitalNurses() {
        return hospitalNurses;
    }

    public void setHospitalNurses(List<Nurse> hospitalNurses) {
        this.hospitalNurses = hospitalNurses;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", hospitalDoctors=" + hospitalDoctors +
                ", hospitalAppointments=" + hospitalAppointments +
                '}';
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

    public Nurse recordNurse(String nurseName, int nurseAge, String nurseId) {
        Nurse nurse = new Nurse(nurseName, nurseAge, nurseId);
        hospitalNurses.add(nurse);
        return nurse;
    }

    // METODE PENTRU STATISTICI
    public static Map<String, Long> getAppointmentsPerDoctor(Hospital hospital) {
        return hospital.hospitalAppointments.stream()
                .collect(Collectors.groupingBy(a -> a.getDoctor().getIdDoctor(), Collectors.counting()));
    }

    public static Map<String, Long> getDiagnosesFrequency(Hospital hospital) {
        return hospital.hospitalAppointments.stream()
                .filter(a -> a.getDiagnosis() != null && !a.getDiagnosis().isEmpty())
                .collect(Collectors.groupingBy(Appointment::getDiagnosis, Collectors.counting()));
    }

    public static Map<String, Long> getTreatmentsPerNurse(Hospital hospital) {
        return hospital.hospitalNurses.stream()
                .collect(Collectors.toMap(Nurse::getIdNurse, n -> (long) n.getAdministeredTreatments().size()));
    }

    public static Map<String, Long> getAppointmentsPerPatient(Hospital hospital) {
        return hospital.hospitalAppointments.stream()
                .collect(Collectors.groupingBy(a -> a.getPatient().getIdPatient(), Collectors.counting()));
    }
}
