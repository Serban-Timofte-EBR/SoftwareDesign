package week9_Proxy.program;

import week9_Proxy.models.IPestera;
import week9_Proxy.models.Pestera;
import week9_Proxy.models.PesteraProxy;

public class Main {
    public static void main(String[] args) {
        IPestera pestera = new Pestera();
        pestera.vizitare("Gigel");
        pestera.vizitare("Gigica");
        pestera.vizitare("Gigi");
        System.out.println("Numar vizitatori all time: " + pestera.getNrVizitatori());

        System.out.println("\n=================================================================\n");

        IPestera pesteraPorxy = new PesteraProxy((Pestera) pestera);
        pesteraPorxy.vizitare("Gigel");
        pesteraPorxy.vizitare("Gigica");
        pesteraPorxy.vizitare("Gigi");
        pesteraPorxy.vizitare("Gigi Duru");
        pesteraPorxy.vizitare("Georgel");
        pesteraPorxy.vizitare("Ionica");
    }
}
