package Creationale.X_Practice.Bar.program;

import Creationale.X_Practice.Bar.models.Barman;
import Creationale.X_Practice.Bar.models.Bautura;
import Creationale.X_Practice.Bar.models.DificultatePreparare;

public class Main {
    public static void main(String[] args) {
//        Barman barman = Barman.getInstance("Ionel Popescu");
//
//        barman.preiaComanda(new Bautura(DificultatePreparare.MEDIE, 7));
//        barman.preiaComanda(new Bautura(DificultatePreparare.SCAZUTA, 2));
//        barman.preiaComanda(new Bautura(DificultatePreparare.MEDIE, 10));
//        barman.preiaComanda(new Bautura(DificultatePreparare.MICA, 1));
//
//        System.out.println(barman);

        System.out.println("=== Se creeaza comenzile ===");

        Bautura bautura1 = new Bautura(DificultatePreparare.MICA, 5);
        Bautura bautura2 = new Bautura(DificultatePreparare.MEDIE, 7);
        Bautura bautura3 = new Bautura(DificultatePreparare.MARE, 10);
        Bautura bautura4 = new Bautura(DificultatePreparare.MICA, 6);
        Bautura bautura5 = new Bautura(DificultatePreparare.MEDIE, 8);

        System.out.println("\n=== Se aloca comenzile ===");

        Barman.alocaComanda(bautura1);
        Barman.alocaComanda(bautura2);
        Barman.alocaComanda(bautura3);
        Barman.alocaComanda(bautura4);
        Barman.alocaComanda(bautura5);
    }
}
