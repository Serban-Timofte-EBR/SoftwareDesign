package thread_safe;

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

    public static synchronized Government getInstance() {
        if (instance == null) {
            instance = new Government("UK Government", "Rt Hon Sir Keir Starmer", 143.139);
        }
        return instance;
    }

    public void increaseBuget(double amount) {
        this.buget += amount;
        System.out.println("Increased buget: " + buget);
    }

    public void announcement(String dec) {
        System.out.println("New announcement: " + dec);
    }

    @Override
    public String toString() {
        return "Government{" +
                "name='" + name + '\'' +
                ", primeMinister='" + primeMinister + '\'' +
                ", buget=" + buget +
                '}';
    }
}
