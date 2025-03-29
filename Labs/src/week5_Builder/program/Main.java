package week5_Builder.program;

import week5_Builder.models.Magazin;
import week5_Builder.models.MagazinBuilder;
import week5_Builder.models.TipPodea;

public class Main {
    public static void main(String[] args) {
        // Instanta Builder
        MagazinBuilder builder = new MagazinBuilder();

        // Crearea de magazine
        System.out.println("===================== MAGAZINE CREATE PRIN BUILDER =====================");
        Magazin magazin = builder
                .setDenumire("Emag Center")
                .setSuprafata(21.3)
                .setTipPodea(TipPodea.GRESIE)
                .build();

        System.out.println(magazin);

        Magazin magazin2 = builder
                .setDenumire("Ion vinde gogosi")
                .setSuprafata(10.5)
                .setNrIntrari(2)
                .build();

        System.out.println(magazin2);

        Magazin magazin3 = builder
                .setDenumire("Ikea")
                .setSuprafata(100.5)
                .setNrIntrari(5)
                .setTipPodea(TipPodea.LEMN_MASIV)
                .build();

        System.out.println(magazin3);

        Magazin magazin4 = builder
                .setDenumire("Ionescu Shop")
                .setSuprafata(400)
                .setNrIntrari(1)
                .setTipPodea(TipPodea.LEMN_MASIV)
                .build();
        // Testare unicitate magazine
        System.out.println("\n===================== MAGAZINE UNICE =====================");
        System.out.println(magazin);
        System.out.println(magazin2);
        System.out.println(magazin3);

        System.out.println("\n===================== ADAUGARE DECORATIUNI =====================");
        magazin.adaugaDecoratiune("Sticla");
        magazin.adaugaDecoratiune("Poarta de acces");
        magazin.adaugaDecoratiune("Neaone");
        System.out.println(magazin);

        System.out.println();
        magazin2.adaugaDecoratiune("Sticla");
        magazin2.adaugaDecoratiune("Rafturi");
        magazin2.adaugaDecoratiune("POS");
        System.out.println(magazin2);

        System.out.println();
        magazin3.adaugaDecoratiune("Sticla");
        magazin3.adaugaDecoratiune("Ventilatie");
        magazin3.adaugaDecoratiune("Lumini ambientale");
        System.out.println(magazin3);

    }
}
