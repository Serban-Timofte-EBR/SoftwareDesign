package Creationale.X_Practice.Cafea.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CafeaPrototypeBuilder {
    private static Map<String, Cafea> reteteCafea = new HashMap<>();

    static {
        reteteCafea.put("Cafea a la Vasile", new Cafea(TipCafea.ESPRESSO, TipLapte.MIGDALE, List.of("Zahar", "Scortisoara"), true));
        reteteCafea.put("Cafeluta de dimineata de acasa", new Cafea(TipCafea.CAPPUCCINO, TipLapte.OVAZ, List.of("Caramel"), false));
        reteteCafea.put("Cafea cu lapte", new Cafea(TipCafea.LATTE, TipLapte.VACA, List.of("Miere"), true));
    }

    public static Cafea getCafea(String numeCafea) {
        Cafea reteta = reteteCafea.getOrDefault(numeCafea, null);
        if (reteta == null) {
            System.out.println("[ERROR]: Cafea " + numeCafea + " n'existe pas");
            return null;
        }
        return (Cafea) reteta.prepareCoffee();
    }
}
