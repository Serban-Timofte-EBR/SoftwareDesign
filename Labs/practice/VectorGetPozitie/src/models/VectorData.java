package models;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class VectorData {
    private Set<Integer> punctaje;
    private Map<Integer, Integer> rankMap;

    public VectorData(Set<Integer> punctaje) {
        this.punctaje = punctaje;
        this.rankMap = computeRanks();
    }

//    private Map<Integer, Integer> computeRanks() {
//        List<Integer> sortedList = new ArrayList<>(punctaje);
//        sortedList.sort(Collections.reverseOrder());
//
//        Map<Integer, Integer> rankMap = new HashMap<>();
//        int rank = 1;
//        for (int val : sortedList) {
//            rankMap.put(val, rank);
//            rank++;
//        }
//        return rankMap;
//    }

    private Map<Integer, Integer> computeRanks() {
        if (punctaje.isEmpty()) {
            return new HashMap<>();
        }

        int minValue = Collections.min(punctaje);
        int maxValue = Collections.max(punctaje);

        int range = maxValue - minValue + 1;
        int[] countArray = new int[range];

        for (int num : punctaje) {
            countArray[num - minValue] = 1;
        }

        List<Integer> sortedList = new ArrayList<>();
        for (int i = range - 1; i >= 0; i--) {
            if (countArray[i] == 1) {
                sortedList.add(i + minValue);
            }
        }

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int val : sortedList) {
            rankMap.put(val, rank++);
        }

        return rankMap;
    }

    public int getPozitie(int pct) {
        int position = rankMap.getOrDefault(pct, -1);
        writeToFile(pct, position);
        return position;
    }

    private void writeToFile(int pct, int result) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/results.txt", true), StandardCharsets.UTF_8))) {
            if (result == -1) {
                bw.write("Invalid input!");
                bw.newLine();
            } else {
                bw.write("Position of " + pct + ": " + result);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to output file: " + e);
        }
    }

    @Override
    public String toString() {
        return "VectorData{" + "punctaje=" + punctaje + '}';
    }
}