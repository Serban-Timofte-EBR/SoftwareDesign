import jdk.jshell.execution.Util;
import models.Appointment;
import models.Doctor;
import models.Hospital;
import models.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hospital spitalulDeUrgentaFloreasca = new Hospital("Spitalul de Urgenta Floreasca");

        Doctor doctorCardiologie = spitalulDeUrgentaFloreasca.recordDoctor("Ionescu", 43, "doc46-21-78");
        Doctor doctorPediatrie = spitalulDeUrgentaFloreasca.recordDoctor("Pavelescu", 76, "dc89-21-32");

        Patient patientCardio = spitalulDeUrgentaFloreasca.createPatient("Ioana", 56, "pat-card-21");
        Patient patientPediatrie = spitalulDeUrgentaFloreasca.createPatient("Anca", 56, "pat-card-22");

        Appointment a1 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-32", new Date(221L), doctorCardiologie, patientCardio);
        Appointment a2 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-21", new Date(222L), doctorPediatrie, patientPediatrie);

        String mesaj = doctorCardiologie.recordDiagnostic(a1, new Date(333L), "Insuficienta cardiaca");
        System.out.println(mesaj);

        String mesaj2 = doctorPediatrie.recordDiagnostic(a1, new Date(333L), "Insuficienta cardiaca");
        System.out.println(mesaj2);

    }
}