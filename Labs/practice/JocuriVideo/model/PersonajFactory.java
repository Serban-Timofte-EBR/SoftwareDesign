package Creationale.X_Practice.JocuriVideo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonajFactory {
    private Map<String, Personaj> personajes = new HashMap<>();

    PersonajFactory() {
        personajes.put("Vrajitor", new Vrajitor(
                new ArrayList<>(List.of(
                        "Abracadabra!",
                        "Puterea întunericului e cu mine.",
                        "Deschid portalul interzis!",
                        "Fulger din ceruri!",
                        "Visele tale devin realitate... sau coșmaruri!"
                )),
                new Pozitie(21,3)
        ));

        personajes.put("Animal", new Animal(
                new ArrayList<>(List.of(
                        "Grrr!",
                        "Miau!",
                        "Hâm-hâm!",
                        "Ssshhh...",
                        "*rage animalic*"
                )),
                new Pozitie(21,10)
        ));

        personajes.put("SuperErou", new SuperErou(
                new ArrayList<>(List.of(
                        "Sunt aici să salvez lumea!",
                        "Niciun rău nu scapă nepedepsit.",
                        "E timpul pentru dreptate!",
                        "Zbor spre victorie!",
                        "Inamicul nu are nicio șansă."
                )),
                new Pozitie(25, 9)
        ));
    }

    Personaj getPersonaj(String type) {
        Personaj personaj = personajes.get(type);
        return personaj.clonePesonaj();
    }
}
