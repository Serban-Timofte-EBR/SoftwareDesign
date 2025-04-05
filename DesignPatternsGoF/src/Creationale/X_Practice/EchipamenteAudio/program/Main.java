package Creationale.X_Practice.EchipamenteAudio.program;

import Creationale.X_Practice.EchipamenteAudio.models.SistemAudio;
import Creationale.X_Practice.EchipamenteAudio.models.SistemAudioBuilder;
import Creationale.X_Practice.EchipamenteAudio.models.SistemeAudioRegistry;
import Creationale.X_Practice.EchipamenteAudio.models.TipEchipament;

public class Main {
    public static void main(String[] args) {
        SistemAudioBuilder builder = new SistemAudioBuilder();

        SistemAudio sistemAudio = builder
                .addEchipament(TipEchipament.MICROFON)
                .addEchipament(TipEchipament.BOXA)
                .addEchipament(TipEchipament.BOXA)
                .buid();
        SistemeAudioRegistry.addSistemAudio("Sistem simplu", sistemAudio);

        System.out.println(sistemAudio);

        SistemAudio sistemAudio2 = builder
                .addEchipament(TipEchipament.MICROFON)
                .addEchipament(TipEchipament.BOXA)
                .addEchipament(TipEchipament.MIXER)
                .buid();
        SistemeAudioRegistry.addSistemAudio("Sistem complex", sistemAudio2);

        System.out.println(sistemAudio2);
    }
}
