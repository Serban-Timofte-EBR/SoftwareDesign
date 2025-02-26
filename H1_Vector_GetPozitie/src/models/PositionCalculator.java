package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PositionCalculator {
    private int[] punctaje;

    public PositionCalculator(int[] punctaje) {
        this.punctaje = punctaje;
    }

    public void getPozitie(int punctaj) {
        List<Integer> sortedList = new ArrayList<>();
        for (int val:punctaje) {
            sortedList.add(val);
        }

        sortedList.sort(Comparator.reverseOrder());
    }
}
