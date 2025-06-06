package Creationale.FactoryMethod.program;

import Creationale.FactoryMethod.models.ESPRESSOFacotory;
import Creationale.FactoryMethod.models.Bautura;
import Creationale.FactoryMethod.models.LATTEFactory;

public class Main {
    public static void main(String[] args) {
        ESPRESSOFacotory espressoFacotory = new ESPRESSOFacotory();
        Bautura espresso = espressoFacotory.creareBautura();
        Bautura latte = espressoFacotory.creareBautura();

        espresso.prepara();
        latte.prepara();

        LATTEFactory latteFactory = new LATTEFactory();
        Bautura latte2 = latteFactory.creareBautura();
        Bautura espresso2 = latteFactory.creareBautura();

        latte2.prepara();
        espresso2.prepara();
    }
}