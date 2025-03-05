import models.*;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        Hospital spitalulDeUrgentaFloreasca = Hospital.getInstance("Spitalul de Urgenta Floreasca");

        Doctor doctorCardiologie = spitalulDeUrgentaFloreasca.recordDoctor("Ionescu", 43, "doc46-21-78");
        Doctor doctorPediatrie = spitalulDeUrgentaFloreasca.recordDoctor("Pavelescu", 76, "dc89-21-32");
        Doctor doctorOrtopedie = spitalulDeUrgentaFloreasca.recordDoctor("Marinescu", 50, "doc56-98-12");
        Doctor doctorDermatologie = spitalulDeUrgentaFloreasca.recordDoctor("Popescu", 39, "doc32-54-77");

        Patient patientCardio = spitalulDeUrgentaFloreasca.createPatient("Ioana", 56, "pat-card-21");
        Patient patientPediatrie = spitalulDeUrgentaFloreasca.createPatient("Anca", 56, "pat-ped-22");
        Patient patientOrto = spitalulDeUrgentaFloreasca.createPatient("Mihai", 34, "pat-ort-10");
        Patient patientDerm = spitalulDeUrgentaFloreasca.createPatient("Raluca", 28, "pat-derm-30");

        Nurse nurseCardio = spitalulDeUrgentaFloreasca.recordNurse("Maria", 35, "nurse-101");
        Nurse nursePediatrie = spitalulDeUrgentaFloreasca.recordNurse("Elena", 42, "nurse-102");
        Nurse nurseOrto = spitalulDeUrgentaFloreasca.recordNurse("Diana", 40, "nurse-103");
        Nurse nurseDerm = spitalulDeUrgentaFloreasca.recordNurse("Alexandra", 38, "nurse-104");

        Appointment a1 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-32", new Date(221L), doctorCardiologie, patientCardio);
        Appointment a2 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-21", new Date(222L), doctorPediatrie, patientPediatrie);
        Appointment a3 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-30", new Date(223L), doctorCardiologie, patientPediatrie);
        Appointment a4 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-33", new Date(224L), doctorPediatrie, patientCardio);
        Appointment a5 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-40", new Date(225L), doctorOrtopedie, patientOrto);
        Appointment a6 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-50", new Date(226L), doctorDermatologie, patientDerm);
        Appointment a7 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-60", new Date(227L), doctorOrtopedie, patientDerm);
        Appointment a8 = spitalulDeUrgentaFloreasca.scheduleAppointment("fl-app-21-70", new Date(228L), doctorDermatologie, patientOrto);

        doctorCardiologie.recordDiagnostic("fl-app-21-32", new Date(333L), "Insuficienta cardiaca", spitalulDeUrgentaFloreasca);
        doctorPediatrie.recordDiagnostic("fl-app-21-21", new Date(333L), "Gripa", spitalulDeUrgentaFloreasca);
        doctorPediatrie.recordDiagnostic("fl-app-21-30", new Date(333L), "Gripa", spitalulDeUrgentaFloreasca);
        doctorCardiologie.recordDiagnostic("fl-app-21-33", new Date(333L), "Hipertensiune", spitalulDeUrgentaFloreasca);
        doctorOrtopedie.recordDiagnostic("fl-app-21-40", new Date(333L), "Fractura de femur", spitalulDeUrgentaFloreasca);
        doctorDermatologie.recordDiagnostic("fl-app-21-50", new Date(333L), "Eczema cronica", spitalulDeUrgentaFloreasca);
        doctorOrtopedie.recordDiagnostic("fl-app-21-60", new Date(333L), "Gripa", spitalulDeUrgentaFloreasca);
        doctorDermatologie.recordDiagnostic("fl-app-21-70", new Date(333L), "Acnee severa", spitalulDeUrgentaFloreasca);

        nurseCardio.administerTreatment(patientCardio.getIdPatient(), "Aspirin 100mg");
        nursePediatrie.administerTreatment(patientPediatrie.getIdPatient(), "Antibiotic 250mg");
        nurseCardio.administerTreatment(patientPediatrie.getIdPatient(), "Paracetamol 500mg");
        nursePediatrie.administerTreatment(patientCardio.getIdPatient(), "Ibuprofen 200mg");
        nurseOrto.administerTreatment(patientOrto.getIdPatient(), "Analgezic 400mg");
        nurseDerm.administerTreatment(patientDerm.getIdPatient(), "Cremă antiinflamatoare");
        nurseOrto.administerTreatment(patientDerm.getIdPatient(), "Ghips pentru entorsă");
        nurseDerm.administerTreatment(patientOrto.getIdPatient(), "Gel antibacterian");

        System.out.println(nurseCardio);
        System.out.println(nursePediatrie);
        System.out.println(nurseOrto);
        System.out.println(nurseDerm);

        System.out.println("\nStatistici: ");
        System.out.println("Programări per doctor: " + Hospital.getAppointmentsPerDoctor(spitalulDeUrgentaFloreasca));
        System.out.println("Distribuția diagnosticelor: " + Hospital.getDiagnosesFrequency(spitalulDeUrgentaFloreasca));
        System.out.println("Tratamente administrate per asistentă: " + Hospital.getTreatmentsPerNurse(spitalulDeUrgentaFloreasca));
        System.out.println("Programări per pacient: " + Hospital.getAppointmentsPerPatient(spitalulDeUrgentaFloreasca));
    }
}
