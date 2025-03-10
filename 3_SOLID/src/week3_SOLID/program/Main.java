package week3_SOLID.program;

import week3_SOLID.clase.Angajat;
import week3_SOLID.clase.Lucrator;
import week3_SOLID.clase.Manager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // De implementat o varianta care sa respecte si S. si O
    public static void main(String[] args) {
        Lucrator lucarator1 = new Lucrator("John");
        Lucrator lucarator2 = new Lucrator("Jane");

        Manager manager = new Manager("Vasile");

        List<Angajat> angajati = new ArrayList<>();
        angajati.add(lucarator1);
        angajati.add(lucarator2);
        angajati.add(manager);

        float bugetSalarii = 0;
        for (Angajat angajat : angajati) {
            bugetSalarii += angajat.calculatorSalariu();
        }
        System.out.println("Buget salariu: " + bugetSalarii);
    }
}