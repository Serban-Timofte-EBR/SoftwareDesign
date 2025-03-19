package lazy;

public class Government {
    private static Government instance;

    private String name;
    private String primeMinister;
    private double buget;

    private Government(String name, String primeMinister, double buget) {
        this.name = name;
        this.primeMinister = primeMinister;
        this.buget = buget;
    }

    public static Government getInstance(String name, String primeMinister, double buget) {
        if (instance == null) {
            instance = new Government(name, primeMinister, buget);
        }
        return instance;
    }
}
