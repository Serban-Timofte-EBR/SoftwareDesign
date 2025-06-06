package Creationale.X_Practice.SenzorHibrid.models;

import java.util.List;

public class RaportAerCurat implements AbstractAirQualityReport {
    private String dataGenerare;
    private String locatie;
    private String emergencyLevel;
    private List<String> informatii;

    RaportAerCurat(String dataGenerare, String locatie) {
        this.dataGenerare = dataGenerare;
        this.locatie = locatie;
        this.emergencyLevel = "LOW";
        this.informatii = List.of("Aerul curat", "Calitate aer excelenta", "Nu omoara viata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RaportAerCurat{");
        sb.append("dataGenerare='").append(dataGenerare).append('\'');
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append(", emergencyLevel='").append(emergencyLevel).append('\'');
        sb.append(", informatii=").append(informatii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String generareRezumatRaport() {
        return "Aerul este curat, ceea ce ajuta la sanatatea generala a populatiei";
    }
}
