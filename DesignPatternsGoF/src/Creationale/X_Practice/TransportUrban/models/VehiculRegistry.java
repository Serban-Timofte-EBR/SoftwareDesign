package Creationale.X_Practice.TransportUrban.models;

import java.util.HashMap;
import java.util.Map;

public class VehiculRegistry {
    private static Map<String, Vehicul> registry = new HashMap<String, Vehicul>();

    public static void adaugaVehicul(Vehicul vehicul) {
        Vehicul validator = VehiculRegistry.getVehicul(vehicul.getNumarInregistratre());
        if (validator != null) {
            System.out.println("[ERROR] Exista deja un vehicul inregistrat pentru aceasta comanda");
            return;
        }
        registry.put(vehicul.getNumarInregistratre(), vehicul);
    }

    public static Vehicul getVehicul(String numarInregistrare) {
        return registry.getOrDefault(numarInregistrare, null);
    }
}
