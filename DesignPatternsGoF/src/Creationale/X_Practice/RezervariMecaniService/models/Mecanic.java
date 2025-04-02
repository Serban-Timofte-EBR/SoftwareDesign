package Creationale.X_Practice.RezervariMecaniService.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mecanic {
    private final static Map<Integer, Mecanic> registry = new HashMap<>();
    private static int ID_COUNTER = 1;

    private int id;
    private String nume;
    private double costPerRezervare;
    private List<Rezervare> rezervari = new ArrayList<>();
    private int nrRezervari = 0;

    private Mecanic(String nume, double costPerRezervare) {
        this.id = ID_COUNTER++;
        this.nume = nume;
        this.costPerRezervare = costPerRezervare;
    }

    public int getId() {
        return id;
    }

    static {
        Mecanic mecanicDorel = new Mecanic("Dorel", 78.5);
        Mecanic mecanicIon = new Mecanic("Ion", 65.0);
        Mecanic mecanicMaria = new Mecanic("Maria", 85.0);
        Mecanic mecanicAndrei = new Mecanic("Andrei", 90.0);
        Mecanic mecanicElena = new Mecanic("Elena", 70.0);
        Mecanic mecanicMora = new Mecanic("Mora", 60.0);
        Mecanic mecanicMihai = new Mecanic("Mihai", 75.0);
        Mecanic mecanicCristi = new Mecanic("Cristi", 80.0);
        Mecanic mecanicRadu = new Mecanic("Radu", 88.0);
        Mecanic mecanicAlex = new Mecanic("Alex", 95.0);
        Mecanic mecanicAndreea = new Mecanic("Andreea", 82.0);

        registry.put(mecanicDorel.getId(), mecanicDorel);
        registry.put(mecanicIon.getId(), mecanicIon);
        registry.put(mecanicMaria.getId(), mecanicMaria);
        registry.put(mecanicAndrei.getId(), mecanicAndrei);
        registry.put(mecanicElena.getId(), mecanicElena);
        registry.put(mecanicMora.getId(), mecanicMora);
        registry.put(mecanicMihai.getId(), mecanicMihai);
        registry.put(mecanicCristi.getId(), mecanicCristi);
        registry.put(mecanicRadu.getId(), mecanicRadu);
        registry.put(mecanicAlex.getId(), mecanicAlex);
        registry.put(mecanicAndreea.getId(), mecanicAndreea);
    }

    public static Mecanic getMecanicById(int id) {
        return registry.get(id);
    }

    public void handleRezervare(Rezervare rezervare) {
        rezervari.add(rezervare);
        this.nrRezervari++;
    }

    public double generareStatDePlate() {
        return this.costPerRezervare * this.nrRezervari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mecanic{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", costPerRezervare=").append(costPerRezervare);
        sb.append(", nrRezervari=").append(nrRezervari);
        sb.append('}');
        return sb.toString();
    }
}
