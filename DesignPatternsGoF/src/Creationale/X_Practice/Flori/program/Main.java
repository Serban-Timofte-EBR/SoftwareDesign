package Creationale.X_Practice.Flori.program;

import Creationale.X_Practice.Flori.models.Buchet;
import Creationale.X_Practice.Flori.models.BuchetPrototypeFactory;
import Creationale.X_Practice.Flori.models.TipBuchet;

public class Main {
    public static void main(String[] args) {
        BuchetPrototypeFactory prototypeFactory = new BuchetPrototypeFactory();

        Buchet buchet1 = prototypeFactory.getBuchet(TipBuchet.CORPORATE);
        buchet1.setAdresaLivare("Strada 1, Nr. 2");
        buchet1.setMesajCartonas("La multi ani, sefule!");
        System.out.println(buchet1);

        Buchet buchet2 = prototypeFactory.getBuchet(TipBuchet.ROMANTIC);
        buchet2.setAdresaLivare("Strada 3, Nr. 4");
        buchet2.setMesajCartonas("Te iubesc!");
        System.out.println(buchet2);

        Buchet buchet3 = prototypeFactory.getBuchet(TipBuchet.SARBATOARE);
        buchet3.setAdresaLivare("Strada 2, Nr. 4");
        buchet3.setMesajCartonas("La multi ani!");
        System.out.println(buchet3);

        Buchet buchet4 = prototypeFactory.getBuchet(TipBuchet.CORPORATE);
        buchet4.addFloare("Iarba decorativa");
        System.out.println(buchet4);

        System.out.println(buchet1);
    }
}
