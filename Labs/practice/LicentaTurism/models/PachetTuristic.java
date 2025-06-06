package Creationale.X_Practice.LicentaTurism.models;

import Creationale.X_Practice.LicentaTurism.models.TurismOptions.TipCamera;
import Creationale.X_Practice.LicentaTurism.models.TurismOptions.TipTransfort;

import java.util.ArrayList;
import java.util.List;

public class PachetTuristic implements AbstractHolidayPackage{
    private TipTransfort tipTransfort;
    private int durata; // Nr. zile
    private TipCamera tipCamera;
    private int nrStele;
    private List<String> activitatiExtra;

    PachetTuristic() {
        this.activitatiExtra = new ArrayList<>();
    }

    PachetTuristic(TipTransfort tipTransfort, int durata, TipCamera tipCamera, int nrStele, List<String> activitatiExtra) {
        this.tipTransfort = tipTransfort;
        this.durata = durata;
        this.tipCamera = tipCamera;
        this.nrStele = nrStele;
        this.activitatiExtra = activitatiExtra;
    }

    @Override
    public void describePackage() {
        System.out.println("================= Pachetul turistic: =================");
        System.out.println("\tTip transport: " + tipTransfort);
        System.out.println("\tDurata: " + durata + " zile");
        System.out.println("\tTip camera: " + tipCamera);
        System.out.println("\tNr stele: " + nrStele);
        System.out.println("\tActivitati extra: " + activitatiExtra);
        System.out.println("======================================================\n");
    }
}
