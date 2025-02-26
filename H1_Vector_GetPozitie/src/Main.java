import models.VectorData;
import utils.ReadFromFileUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<VectorData> vectors = ReadFromFileUtils.readFromFile("src/test_input.txt");
            List<int[]> searchValues = ReadFromFileUtils.readPositionsForSearch("src/input_search_values.txt");

            for (int i = 0; i < vectors.size(); i++) {
                VectorData vector = vectors.get(i);
                int[] searchValue = searchValues.get(i);
                System.out.println("---------------------------");
                for(int value: searchValue){
                    vector.getPozitie(value);
                }
            }
        } catch (Exception e) {
            System.out.println("Error while reading from input file: " + e);
        }
    }
}