package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends Person {
    private final String idPatient;

    public Patient(String name, int age, String idPatient) {
        super(name, age);
        this.idPatient = idPatient;
    }

    public Patient(String idPatient) {
        this.idPatient = idPatient;
    }

    public String getIdPatient() {
        return idPatient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("idPatient='").append(idPatient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
