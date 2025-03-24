package week4_SingletonRegistry.clase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Oven {
    private static Oven instace;
    private static int idNext = 0;

    private int id;
    private List<Dish> preparationQueue;
    private int maximumGrades;

    private Oven(int maximumGrades) {
        id = idNext++;
        preparationQueue = new ArrayList<>();
        this.maximumGrades = maximumGrades;
    }

    public void setMaximumGrades(int maximumGrades) {
        this.maximumGrades = maximumGrades;
    }

    static {
        // Simulare citire din fisier
        int[] gradesFromFile = new int[] {100, 433, 212, 331};
        instace = new Oven(gradesFromFile[idNext]);
    }

    public static Oven getInstance() {
        return instace;
    }

    public void addDish(Dish dish) {
        if (dish.getCookingGrades() <= this.maximumGrades) {
            preparationQueue.add(dish);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Oven{");
        sb.append("id=").append(id);
        sb.append(", preparationQueue=").append(preparationQueue);
        sb.append(", maximumGrades=").append(maximumGrades);
        sb.append('}');
        return sb.toString();
    }
}
