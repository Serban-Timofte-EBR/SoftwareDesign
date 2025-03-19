package static_block_initialization;

public class Government {
    private static final Government instance;

    private String name;
    private String primeMinister;
    private double buget;

    static {
        instance = new Government("UK Government", "Rt Hon Sir Keir Starmer", 143.139);
    }

    private Government(String name, String primeMinister, double buget) {
        this.name = name;
        this.primeMinister = primeMinister;
        this.buget = buget;
    }

    public static Government getInstance() {
        return instance;
    }
}
