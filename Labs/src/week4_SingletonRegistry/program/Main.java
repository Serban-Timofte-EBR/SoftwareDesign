package week4_SingletonRegistry.program;

import week4_SingletonRegistryLazy.clase.Dish;
import week4_SingletonRegistryLazy.clase.Oven;

public class Main {
    private static void tryAddDish(Dish dish) {
        try {
            Oven.addDish(dish);
            System.out.println("[SUCCESS] " + dish.getName() + " assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED] " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=========== INITIAL STATE ===========");
        System.out.println("No ovens yet!");

        Oven.registryOven();
        System.out.println("[INFO]: Oven registered!");

        tryAddDish(new Dish("Pizza", 25, 350));
        tryAddDish(new Dish("Cake", 40, 90));

        Oven.registryOven();
        Oven.registryOven();
        System.out.println("\n[INFO] Added Oven 2 and 3");

        tryAddDish(new Dish("Bread", 30, 220));
        tryAddDish(new Dish("Pie", 20, 200));
        tryAddDish(new Dish("Tart", 35, 160));
        tryAddDish(new Dish("Steak", 50, 450));

        Oven.registryOven();
        System.out.println("\n[INFO] Added Oven 4");

        tryAddDish(new Dish("Steak", 50, 400));

        System.out.println();
        Oven.registryOven();

        System.out.println("\n=========== FINAL STATE ===========");
        Oven.getRegistry().values().forEach(System.out::println);
    }
}
