package Creationale.X_Practice.MeniuriCatering.models;

public class MenuVegetarianFactory implements IFactory {
    @Override
    public Menu createMenu() {
        return new MenuVegetarian();
    }
}
