package Creationale.SimpleFactory.program;

import Creationale.SimpleFactory.models.Bautura;
import Creationale.SimpleFactory.models.BauturaFactory;
import Creationale.SimpleFactory.models.TipBautura;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory = new BauturaFactory();

        Bautura espresso = factory.comandaBautura(TipBautura.ESPRESSO);
        Bautura latte = factory.comandaBautura(TipBautura.LATTE);

        espresso.prepara();
        latte.prepara();

        System.out.println(espresso);
        System.out.println(latte);

        Bautura espresso2 = factory.comandaBautura(TipBautura.ESPRESSO);
        Bautura latte2 = factory.comandaBautura(TipBautura.LATTE);

        espresso2.prepara();
        latte2.prepara();

        System.out.println(espresso2);
        System.out.println(latte2);
    }
}