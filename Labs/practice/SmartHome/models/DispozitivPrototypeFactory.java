package Creationale.X_Practice.SmartHome.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DispozitivPrototypeFactory implements IPrototypeFactory{
    private static final Map<TipPachete, Dispozitiv> prototypes = new HashMap<>();

    static {
        prototypes.put(TipPachete.PACHET_LOW, new Dispozitiv(
                TipuriDispozitiv.TERMOSTAT,
                "IntraNet",
                Arrays.asList("temperatura", "umiditate")
        ));
        prototypes.put(TipPachete.PACHET_STANDARD, new Dispozitiv(
                TipuriDispozitiv.CAMERE_DE_SUPRAVEGHERE,
                "RemoteAccess",
                Arrays.asList("night vision", "miscare")
        ));
        prototypes.put(TipPachete.PACHET_PREMIUM, new Dispozitiv(
                TipuriDispozitiv.ASISTENT_VOCAL,
                "Bluetooth",
                Arrays.asList("voce", "face recognition")
        ));
    }

    @Override
    public DispozitivBuilder getCustomBuilder(TipPachete tipPachete) {
        Dispozitiv prototype = prototypes.get(tipPachete);
        DispozitivBuilder prototypeBuilder = new DispozitivBuilder(prototype);
        return prototypeBuilder;
    }
}
