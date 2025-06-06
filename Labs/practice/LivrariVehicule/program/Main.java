package Creationale.X_Practice.LivrariVehicule.program;

import Creationale.X_Practice.LivrariVehicule.models.Livrare;
import Creationale.X_Practice.LivrariVehicule.models.RegistruLivrari;

public class Main {
    public static void main(String[] args) {
        Livrare l1 = new Livrare(120, 300);
        Livrare l2 = new Livrare(50, 150);
        Livrare l3 = new Livrare(10, 40);
        Livrare l4 = new Livrare(80, 90);

        RegistruLivrari registru = RegistruLivrari.getInstance();
        registru.adaugaLivrare(l1);
        registru.adaugaLivrare(l2);
        registru.adaugaLivrare(l3);

        Thread thread = new Thread(() -> {
            Livrare l5 = new Livrare(25, 60);
            RegistruLivrari.getInstance().adaugaLivrare(l5);
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=== LIVRĂRI ÎNREGISTRATE ===");
        registru.afiseazaLivrari();
    }
}

