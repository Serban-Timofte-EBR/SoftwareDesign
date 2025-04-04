package Creationale.X_Practice.Flori.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuchetPrototypeFactory {
    private final Map<TipBuchet, Buchet> buchetRegistry = new HashMap<>();

    public BuchetPrototypeFactory() {
        try {
            Thread.sleep(2000);
            buchetRegistry.put(TipBuchet.CORPORATE, new Buchet(TipBuchet.CORPORATE, List.of("Ghiocei", "Crini"), "Alb"));
            Thread.sleep(200);
            buchetRegistry.put(TipBuchet.ROMANTIC, new Buchet(TipBuchet.ROMANTIC, List.of("Trandafiri", "Lalele"), "Rosu"));
            Thread.sleep(200);
            buchetRegistry.put(TipBuchet.SARBATOARE, new Buchet(TipBuchet.SARBATOARE, List.of("Orhidee", "Gerbera"), "Mov"));
            Thread.sleep(2000);
            System.out.println("Citirea din baza de date s-a terminat!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Buchet getBuchet(TipBuchet tipBuchet) {
        Buchet buchet = buchetRegistry.get(tipBuchet);
        if (buchet == null) {
            System.out.println("Buchetul dorit nu este disponibil.");
            return null;
        }
        return buchet.createBuchet();
    }
}
