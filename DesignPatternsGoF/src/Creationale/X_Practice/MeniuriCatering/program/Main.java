package Creationale.X_Practice.MeniuriCatering.program;

import Creationale.X_Practice.MeniuriCatering.models.*;

public class Main {
    public static void main(String[] args) {
        MenuVegetarian menuVegetarian = (MenuVegetarian) new MenuVegetarianFactory().createMenu();
        MenuPremium menuPremium = (MenuPremium) new MenuPremiumFactory().createMenu();
        MenuStandard menuStandard = (MenuStandard) new MenuStandardFactory().createMenu();
        MenuStandard menuStandard2 = (MenuStandard) new MenuStandardFactory().createMenu();
        MenuStandard menuStandard3 = (MenuStandard) new MenuStandardFactory().createMenu();

        System.out.println(menuStandard3.calculeazaTimpTotalPreparare(MenuStandard.nrPersoane));
    }
}
