package Creationale.X_Practice.Evenimente.program;

import Creationale.X_Practice.Evenimente.models.Eveniment;
import Creationale.X_Practice.Evenimente.models.EvenimentBuilder;
import Creationale.X_Practice.Evenimente.models.Sala;
import Creationale.X_Practice.Evenimente.models.TipEveniment;

public class Main {
    public static void main(String[] args) {
        EvenimentBuilder builder = new EvenimentBuilder(TipEveniment.NUNTA);


        Eveniment nunta = builder
                .addDecoratiuni("Bufet Suedez")
                .setSala("Sala Palatului")
                .build();

        System.out.println(nunta);

        Eveniment nunta2 = builder
                .setSala("Sala Palatului")
                .build();

        System.out.println(nunta2);

        EvenimentBuilder builderConferinte = new EvenimentBuilder(TipEveniment.CONFERINTA);

        Eveniment conferintaLuiPapuc = builderConferinte
                .setSala("Conf Room 31A")
                .addDecoratiuni("Generator electric")
                .build();

        System.out.println(conferintaLuiPapuc);

        EvenimentBuilder builderAniversari = new EvenimentBuilder(TipEveniment.ANIVERSARE);

        Eveniment aniversare = builderAniversari
                .setSala("Sala Stefan cel Mare")
                .addDecoratiuni("Baloane de sapun")
                .build();

        System.out.println(aniversare);

        System.out.println(Sala.getSala("Sala Palatului"));
    }
}
