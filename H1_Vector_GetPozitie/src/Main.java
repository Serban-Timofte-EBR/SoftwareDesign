import models.VectorData;
import utils.ReadFromFileUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<VectorData> vectors = ReadFromFileUtils.readVectorsFromFile("src/test_input.txt");
            List<int[]> testValues = ReadFromFileUtils.readTestValuesAsArrays("src/input_search_values.txt");

            for (int i = 0; i < vectors.size(); i++) {
                VectorData vector = vectors.get(i);
                int[] values = testValues.get(i);
                for (int value : values) {
                    vector.getPozitie(value);
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
