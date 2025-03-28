package week5_Prototype.modele;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototypeFactory {
    private static Map<TipJucator, Jucator> jucatori = new HashMap<>();

    static {
        System.out.println("Incarcare mapa de jucatori (prototipuri)");
        try {
            jucatori.put(TipJucator.ATACANT, new Jucator("Leo Messi", TipJucator.ATACANT));
            jucatori.put(TipJucator.MIJLOCAS, new Jucator("Andres Iniesta", TipJucator.MIJLOCAS));
            jucatori.put(TipJucator.FUNDAS, new Jucator("Gerald Pique", TipJucator.FUNDAS));
            jucatori.put(TipJucator.PORTAR, new Jucator("Manuel Neuer", TipJucator.PORTAR));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Jucator getPrototypeJucator(TipJucator tipJucator) throws CloneNotSupportedException {
        Jucator prototip = jucatori.getOrDefault(tipJucator, null);
        if (prototip != null) {
            return prototip.clone();
        }
        return null;
    }
}
