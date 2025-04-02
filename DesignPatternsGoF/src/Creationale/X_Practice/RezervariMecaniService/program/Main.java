package Creationale.X_Practice.RezervariMecaniService.program;

import Creationale.X_Practice.RezervariMecaniService.models.Mecanic;
import Creationale.X_Practice.RezervariMecaniService.models.Rezervare;
import Creationale.X_Practice.RezervariMecaniService.models.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== SIMULARE SERVICE AUTO ==========");

        RezervareBuilder builder = new RezervareBuilder("Ion Popescu", "15-04-2024");

        Rezervare r1 = builder.setNumarMasina("B101POP")
                .setDetaliiInterventie("Schimb ulei")
                .build();

        Rezervare r2 = builder.setNumarMasina("CJ23XYZ")
                .setDetaliiInterventie("Verificare frâne")
                .setNumeClient("Andreea Voicu")
                .setDataRezervare("16-04-2024")
                .build();

        Rezervare r3 = builder.setNumarMasina("B200MEC")
                .setDetaliiInterventie("ITP + Geometrie roți")
                .setNumeClient("Radu Munteanu")
                .setDataRezervare("16-04-2024")
                .build();

        Rezervare r4 = builder.setNumarMasina("CL11ABC")
                .setDetaliiInterventie("Schimb distribuție")
                .setNumeClient("Alina Dinu")
                .setDataRezervare("17-04-2024")
                .build();

        Rezervare r5 = builder.setNumarMasina("IF77XYZ")
                .setDetaliiInterventie("Verificare generală + diagnoză")
                .setNumeClient("Cristi Vasile")
                .setDataRezervare("18-04-2024")
                .build();

        // Atribuire rezervări către mecanici din registry
        Mecanic.getMecanicById(1).handleRezervare(r1);  // Dorel
        Mecanic.getMecanicById(2).handleRezervare(r2);  // Ion
        Mecanic.getMecanicById(3).handleRezervare(r3);  // Maria
        Mecanic.getMecanicById(1).handleRezervare(r4);  // Dorel din nou
        Mecanic.getMecanicById(4).handleRezervare(r5);  // Andrei

        System.out.println("\n========== STATURI DE PLATĂ ==========");
        for (int i = 1; i <= 4; i++) {
            Mecanic m = Mecanic.getMecanicById(i);
            if (m != null) {
                System.out.println(m + " -> Stat de plata: " + m.generareStatDePlate() + " RON");
            }
        }

        System.out.println("\n========== MECANICI NEFOLOSITI ==========");
        for (int i = 5; i <= 11; i++) {
            Mecanic m = Mecanic.getMecanicById(i);
            if (m != null) {
                System.out.println(m + " -> Stat de plata: " + m.generareStatDePlate() + " RON");
            }
        }
    }
}