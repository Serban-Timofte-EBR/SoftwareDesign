package programe;

import clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AplicantReader<Student> studentReader = new StudentReader();
        AplicantReader<Angajat> angajatReader = new AngajatReader();
        AplicantReader<Elev> elevReader = new ElevReader();

        List<Student> studenti = studentReader.readAplicants("studenti.txt");
        List<Angajat> angajati = angajatReader.readAplicants("angajati.txt");
        List<Elev> elevi = elevReader.readAplicants("elevi.txt");

        System.out.println("Studenti:");
        studenti.forEach(System.out::println);

        System.out.println("Angajati:");
        angajati.forEach(System.out::println);

        System.out.println("Elevi:");
        elevi.forEach(System.out::println);

        FinantareCalculator calculatorFinantare = new FinantareCalculator("finantare.txt");

        List<Aplicant> aplicanti = new ArrayList<>();
        aplicanti.addAll(studenti);
        aplicanti.addAll(angajati);
        aplicanti.addAll(elevi);

        int bugetTotal = aplicanti.stream()
                .mapToInt(calculatorFinantare::calculeazFinantarea)
                .sum();

        System.out.println("BugetTotal: " + bugetTotal);
    }
}
