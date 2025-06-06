package week6_Builder.program;

import week6_Builder.models.BuilderSenzor;
import week6_Builder.models.IBuilder;
import week6_Builder.models.Senzor;

public class Main {
    public static void main(String[] args) {
        BuilderSenzor builder = new BuilderSenzor(20);

        Senzor senzor = (Senzor) builder
                .setUmiditate(90)
                .setPm10(31)
                .setPm25(30)
                .build();

        System.out.println(senzor.toString());

        // Nu afecteaza celelalte campuri
        Senzor senzor2 = (Senzor) new BuilderSenzor(30)
                .setUmiditate(99)
                .build();

        System.out.println(senzor2.toString());

        Senzor senzor3 = (Senzor) builder
                .setPm10(31)
                .setPm25(44)
                .build();

        System.out.println(senzor3.toString());
    }
}
