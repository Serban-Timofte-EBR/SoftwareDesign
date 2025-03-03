package models;

import javax.print.Doc;
import java.util.Date;
import java.util.List;

public interface IMedicalRecord {
    List<Appointment> getSelfAppointments(Hospital hospital);
    String recordDiagnostic(String appointmentId, Date appointmentDate, String diagnosis, Hospital hospital);
}
