package eager;

public class Government {
    // Eager Initialization - Declare the instance when the class is created
    private static final Government INSTANCE = new Government("UK Government", "Rt Hon Sir Keir Starmer", 143.139);
    private String name;
    private String primeMinister;
    private double buget;

    private Government(String name, String primeMinister, double buget) {
        this.name = name;
        this.primeMinister = primeMinister;
        this.buget = buget;
    }

   public static Government getInstance() {
        return INSTANCE;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }

    public void setPrimeMinister(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    public double getBuget() {
        return buget;
    }

    public void setBuget(double buget) {
        this.buget = buget;
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
        final StringBuilder sb = new StringBuilder("Government{");
        sb.append("name='").append(name).append('\'');
        sb.append(", primeMinister='").append(primeMinister).append('\'');
        sb.append(", buget=").append(buget);
        sb.append('}');
        return sb.toString();
    }
}
