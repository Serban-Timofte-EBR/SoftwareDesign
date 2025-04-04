package Creationale.X_Practice.LicentaTurism.models;

import Creationale.X_Practice.LicentaTurism.models.TurismOptions.TipCamera;
import Creationale.X_Practice.LicentaTurism.models.TurismOptions.TipTransfort;

import java.util.ArrayList;
import java.util.List;

public class PachetTuristicBuilder implements IBuilder {
    private TipTransfort tipTransfort;
    private int durata; // Nr. zile
    private TipCamera tipCamera = TipCamera.SINGLE;
    private int nrStele;
    private List<String> activitatiExtra;

    public PachetTuristicBuilder(TipTransfort tipTransfort, int durata) {
        this.tipTransfort = tipTransfort;
        this.durata = durata;
        this.activitatiExtra = new ArrayList<>();
    }

    public PachetTuristicBuilder setTipTransfort(TipTransfort tipTransfort) {
        this.tipTransfort = tipTransfort;
        return this;
    }

    public PachetTuristicBuilder setDurata(int durata) {
        this.durata = durata;
        return this;
    }

    public PachetTuristicBuilder setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
        return this;
    }

    public PachetTuristicBuilder setNrStele(int nrStele) {
        this.nrStele = nrStele;
        return this;
    }

    public PachetTuristicBuilder setActivitatiExtra(List<String> activitatiExtra) {
        this.activitatiExtra = activitatiExtra;
        return this;
    }

    @Override
    public PachetTuristic build() {
        PachetTuristic pachet = new PachetTuristic(tipTransfort, durata, tipCamera, nrStele, activitatiExtra);

        this.tipCamera = TipCamera.SINGLE;
        this.nrStele = 1;
        this.activitatiExtra = new ArrayList<>();

        return pachet;
    }
}
