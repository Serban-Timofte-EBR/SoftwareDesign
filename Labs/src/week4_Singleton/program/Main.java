package week4_Singleton.program;

import week4_Singleton.models.Masa;
import week4_Singleton.models.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();

        // Demonstram singleton
        Restaurant restaurant2 = Restaurant.getInstance();

        if (restaurant == restaurant2) {
            System.out.println("Restaurant este singleton");
        } else {
            System.out.println("Numai singleton nu e!");
        }

        restaurant.addMasa(new Masa(1, 4, true));
        restaurant.addMasa(new Masa(2, 3, true));
        restaurant.addMasa(new Masa(3, 5, true));
        restaurant.addMasa(new Masa(4, 4, true));
        restaurant2.addMasa(new Masa(5, 4, true));

        System.out.println(restaurant);

        // Aici este ospatarul
        System.out.println();

        System.out.println("Masa rezervata: " + restaurant.getMasa(true, 5));
    }
}
