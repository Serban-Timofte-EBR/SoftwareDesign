package Creationale.X_Practice.Cafea.program;

import Creationale.X_Practice.Cafea.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cafea cafea1 = CafeaPrototypeBuilder.getCafea("Cafea a la Vasile");
        System.out.println("============= Cafea a la Vasile =============");
        System.out.println(cafea1);

        Cafea cafea2 = CafeaPrototypeBuilder.getCafea("Cafeluta de dimineata de acasa");
        System.out.println("============= Cafeluta de dimineata de acasa =============");
        System.out.println(cafea2);

        Cafea cafea3 = CafeaPrototypeBuilder.getCafea("Cafea a la Vasile");
        assert cafea3 != null;
        cafea3.addAroma("Stevie");
        cafea3.setExtraShot(false);
        System.out.println("============= Cafea a la Vasile 2 =============");
        System.out.println(cafea3);

        System.out.println("============= Cafea a la Vasile =============");
        System.out.println(cafea1);

        assert cafea1 != null;
        System.out.println("Equals check: " + cafea1.equals(cafea3));

        IFactory espressoFactory = new CafeaFactory(TipCafea.ESPRESSO, TipLapte.VACA, List.of("Zahar"), true);
        IFactory latteFactory = new CafeaFactory(TipCafea.LATTE, TipLapte.OVAZ, List.of("Scortisoara", "Vanilie"), false);
        IFactory cappuccinoFactory = new CafeaFactory(TipCafea.CAPPUCCINO, TipLapte.MIGDALE, List.of("Stevie"), true);

        System.out.println(espressoFactory.createNewCoffe());
        System.out.println(latteFactory.createNewCoffe());
        System.out.println(cappuccinoFactory.createNewCoffe());
    }
}
