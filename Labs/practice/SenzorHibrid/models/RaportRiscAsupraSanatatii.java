package Creationale.X_Practice.SenzorHibrid.models;

import java.util.List;

public class RaportRiscAsupraSanatatii implements AbstractAirQualityReport {
    private String dataGenerare;
    private String locatie;
    private String emergencyLevel;
    private List<String> informatii;

    RaportRiscAsupraSanatatii(String dataGenerare, String locatie) {
        this.dataGenerare = dataGenerare;
        this.locatie = locatie;
        this.emergencyLevel = "MEDIUM";
        this.informatii = List.of("Avertizare", "Calitate aer medie", "Poate afecta viata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RaportRiscAsupraSanatatii{");
        sb.append("dataGenerare='").append(dataGenerare).append('\'');
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append(", emergencyLevel='").append(emergencyLevel).append('\'');
        sb.append(", informatii=").append(informatii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String generareRezumatRaport() {
        return "Aerul este FOARTE poluat, ceea ce poate afecta sanatatea generala a populatiei";
    }
}
