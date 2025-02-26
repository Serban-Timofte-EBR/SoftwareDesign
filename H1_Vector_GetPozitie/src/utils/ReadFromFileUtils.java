package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileUtils {
    public static int[] readFromFile(String filename) {
        List<Integer> vector = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    vector.add(Integer.parseInt(token));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Vector input file not found: " + e);
        } catch (IOException e) {
            throw new RuntimeException("Error while reading from input file: " + e);
        }
        return vector.stream().mapToInt(i -> i).toArray();
    }
}
