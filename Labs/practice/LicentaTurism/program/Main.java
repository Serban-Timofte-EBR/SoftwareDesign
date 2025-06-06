package Creationale.X_Practice.LicentaTurism.program;

import Creationale.X_Practice.LicentaTurism.models.LicentaDeTurism;
import Creationale.X_Practice.LicentaTurism.models.PachetTuristic;
import Creationale.X_Practice.LicentaTurism.models.PachetTuristicBuilder;
import Creationale.X_Practice.LicentaTurism.models.TooManyChangeLicenceRequests;
import Creationale.X_Practice.LicentaTurism.models.TurismOptions.TipTransfort;

import java.util.List;

public class Main {
    private static LicentaDeTurism licenta2;

    public static void main(String[] args) {
        LicentaDeTurism licenta1 = LicentaDeTurism.getInstance();

        Thread licentaThread = new Thread(() -> {
            licenta2 = LicentaDeTurism.getInstance();
        });
        licentaThread.start();
        try {
            licentaThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        LicentaDeTurism licenta3 = LicentaDeTurism.getInstance();

        if (licenta1 == licenta3 && licenta1 == licenta2) {
            System.out.println("Toate instanțele sunt aceleași.");
        } else {
            System.out.println("Instanțele sunt diferite.");
        }

        licenta1.setLicenseNumber("12345");
        try {
            licenta2.setLicenseNumber("12345");
        } catch (TooManyChangeLicenceRequests e) {
            System.out.println(e.getMessage());
        }

        PachetTuristicBuilder builder = new PachetTuristicBuilder(TipTransfort.AUTOCAR, 7);
        PachetTuristic pachet1 = builder
                .setNrStele(5)
                .setActivitatiExtra(List.of("Excursie la mare", "Vizita la muzeu"))
                .build();
        pachet1.describePackage();

//        pachet1.setTipTransfort(TipTransfort.AVION);

        PachetTuristic pachet2 = builder
                .setTipTransfort(TipTransfort.AVION)
                .setNrStele(4)
                .build();
        pachet2.describePackage();

        PachetTuristic pachet3 = builder
                .setTipTransfort(TipTransfort.AVION)
                .setDurata(14)
                .setNrStele(5)
                .setActivitatiExtra(List.of("Activitate 1", "Activitate 2", "Activitate 3"))
                .build();
        pachet3.describePackage();
    }
}
