package week4_SingletonRegistry.program;

import week4_SingletonRegistry.clase.Dish;
import week4_SingletonRegistry.clase.Oven;

public class Main {
    public static void main(String[] args) {
        Oven oven = Oven.getInstance();

        oven.addDish(new Dish("Pizza", 30, 100));
        oven.addDish(new Dish("Cartofi Dulci", 30, 322));

        System.out.println(oven);
    }
}
