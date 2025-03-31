package Creationale.X_Practice.ServiceAuto.models;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private Map<ModeleMasini, Sticker> prototypes = new HashMap<>();

    public PrototypeFactory() {
        prototypes.put(ModeleMasini.SKODA, new Sticker(new Masina(ModeleMasini.SKODA)));
        prototypes.put(ModeleMasini.VOLVO, new Sticker(new Masina(ModeleMasini.VOLVO)));
        prototypes.put(ModeleMasini.BMW, new Sticker(new Masina(ModeleMasini.BMW)));
    }

    public Sticker getPrototype(ModeleMasini masini) {
        Sticker prototype = prototypes.get(masini);
        return (Sticker) prototype.cloneSticker();
    }
}
