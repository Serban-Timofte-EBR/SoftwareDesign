package Creationale.X_Practice.MeniuriCatering.models;

public class MenuStandardFactory implements IFactory {
    @Override
    public Menu createMenu() {
        return new MenuStandard();
    }
}
