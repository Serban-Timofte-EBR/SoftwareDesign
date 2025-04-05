package Creationale.X_Practice.EchipamenteAudio.models;

import java.util.HashMap;
import java.util.Map;

public class SistemeAudioRegistry {
    private static Map<String, SistemAudio> registry = new HashMap<>();

    private SistemeAudioRegistry() {}

    public static void addSistemAudio(String nume, SistemAudio sistemAudio) {
        if (sistemAudio != null) {
            registry.put(nume, sistemAudio);
        } else {
            System.out.println("Nu existe un sistem de audio");
        }
    }

    public static SistemAudio getSistemAudio(String nume) {
        return registry.getOrDefault(nume, null);
    }
}
