package Creationale.X_Practice.Tort.program;

import Creationale.X_Practice.Tort.models.*;

public class Main {
    public static void main(String[] args) {
        CakeBuilder cakeBuilder = new CakeBuilder(CakeDimension.MEDIUM, "Chocolate");

        Cake cake1 = cakeBuilder
                .setGlaze("Vanilla")
                .addDecoration("Bombonela stralucitoare")
                .addDecoration("Artificii")
                .build();
        System.out.println(cake1);

        Cake cake2 = cakeBuilder.build();
        System.out.println(cake2);

        CakeBuilder builderFromPrototype = CakePrototypeFactory.getCakeTemplate(CakeType.TORT_NUNTA);
        Cake cake3 = cakeBuilder.build();
        System.out.println(cake3);
    }
}
