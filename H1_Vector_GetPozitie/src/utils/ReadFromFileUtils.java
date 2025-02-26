package utils;

import models.VectorData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileUtils {
    public static List<VectorData> readFromFile(String filename) {
        List<VectorData> vectors = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                List<Integer> vector = new ArrayList<>();
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    vector.add(Integer.parseInt(token.trim()));
                }
                vectors.add(new VectorData(vector));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Vector input file not found: " + e);
        } catch (IOException e) {
            throw new RuntimeException("Error while reading from vectors file: " + e);
        }

        return vectors;
    }

    public static List<int[]> readPositionsForSearch(String filename) {
        List<int[]> testValues = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] tokens = line.split(" ");
                int[] values = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    values[i] = Integer.parseInt(tokens[i].trim());
                }
                testValues.add(values);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error while reading test values file: " + e);
        }

        return testValues;
    }
}
