package Creationale.X_Practice.Evenimente.models;

import java.util.HashMap;
import java.util.Map;

public class Sala {
    private static Map<String, Sala> centralizatorSali = new HashMap<>();

    private String nume;
    private String cladire;
    private int numarEvenimente = 0;

    private Sala(String cladire, String nume) {
        this.cladire = cladire;
        this.nume = nume;
    }

    static {
        centralizatorSali.put("Sala Palatului", new Sala("Sala Palatului", "Palatului"));
        centralizatorSali.put("Conf Room 31A", new Sala("Conf Room 31A", "Campus Building"));
        centralizatorSali.put("Sala Stefan cel Mare", new Sala("Sala Stefan cel Mare", "Campus Building"));
    }

    public static Sala getSala(String nume) {
        return centralizatorSali.getOrDefault(nume, null);
    }

    public void adaugaEveniment() {
        this.numarEvenimente++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sala{");
        sb.append("cladire='").append(cladire).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarEvenimente=").append(numarEvenimente);
        sb.append('}');
        return sb.toString();
    }
}
