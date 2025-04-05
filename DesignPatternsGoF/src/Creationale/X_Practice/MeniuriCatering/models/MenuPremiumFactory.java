package Creationale.X_Practice.MeniuriCatering.models;

public class MenuPremiumFactory implements IFactory {

    @Override
    public Menu createMenu() {
        return new MenuPremium();
    }
}
