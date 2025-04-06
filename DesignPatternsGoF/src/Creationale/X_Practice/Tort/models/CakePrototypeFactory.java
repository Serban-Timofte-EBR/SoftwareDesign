package Creationale.X_Practice.Tort.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CakePrototypeFactory {
    private static Map<CakeType, Cake> cakesCatalog = new HashMap<>();

    static {
        cakesCatalog.put(CakeType.TORT_ANIVERSARE, new Cake(
                Arrays.asList("Bomboane decorative", "Ambalaj transport"),
                CakeDimension.MEDIUM,
                "Chocolate",
                "Vanilla"
        ));
        cakesCatalog.put(CakeType.TORT_NUNTA, new Cake(
                Arrays.asList("Artificii", "Animale decorative"),
                CakeDimension.MEDIUM,
                "Forest Fruits",
                "Chocolate"
        ));
    }

    public static CakeBuilder getCakeTemplate(CakeType type) {
        Cake prototype = cakesCatalog.get(type);
        CakeBuilder builder = new CakeBuilder(prototype);
        return builder;
    }
}
