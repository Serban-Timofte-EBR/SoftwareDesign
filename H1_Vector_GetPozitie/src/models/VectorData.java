package models;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class VectorData {
    private final List<Integer> punctaje;
    private final Map<Integer, Integer> rankMap;

    public VectorData(List<Integer> punctaje) {
        this.punctaje = punctaje;
        this.rankMap = computeRanks();
    }

    private Map<Integer, Integer> computeRanks() {
        List<Integer> sortedList = new ArrayList<>(punctaje);
        sortedList.sort(Collections.reverseOrder());

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int val : sortedList) {
            if (!rankMap.containsKey(val)) {
                rankMap.put(val, rank);
            }
            rank++;
        }
        return rankMap;
    }

    public int getPozitie(int pct) {
        int position = rankMap.getOrDefault(pct, -1);
        System.out.println(position);
        writeToFile(position);
        return position;
    }

    private void writeToFile(int result) {
        try (FileOutputStream fos = new FileOutputStream("src/results.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             BufferedWriter bw = new BufferedWriter(osw)
        ) {
            bw.write(result);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Error writing to output file: " + e);
        }
    }

    @Override
    public String toString() {
        return "VectorData{" + "punctaje=" + punctaje + '}';
    }
}