package week3_SOLID.program;

import week3_SOLID.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lucrator lucrator1 = new Lucrator("John", 40, 15, 1000);
        Lucrator lucrator2 = new Lucrator("Jane", 35, 14, 1200);
        Manager manager = new Manager("Vasile", 50, 30, 3000);
        Freelancer freelancer1 = new Freelancer(20, 50);
        Freelancer freelancer2 = new Freelancer(10, 70);

        List<ISalariedEmployee> angajati = new ArrayList<>();
        angajati.add(lucrator1);
        angajati.add(lucrator2);
        angajati.add(manager);
        angajati.add(freelancer1);
        angajati.add(freelancer2);

        float bugetSalarii = 0;
        for (ISalariedEmployee angajat : angajati) {
            bugetSalarii += CalculatorSalariu.calculareSalariu(angajat);
        }
        System.out.println("Buget salariu total: " + bugetSalarii);
    }
}