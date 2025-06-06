package Creationale.X_Practice.SenzorHibrid.models;

public class Senzor implements AbstractAirQualitySensor{
    private int pm25;
    private int pm10;
    private int voc;
    private int co;
    private int temperature;
    private int humidity;

    Senzor(int pm25, int pm10, int voc, int co, int temperature, int humidity) {
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.voc = voc;
        this.co = co;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String getInstantMeasurements() {
        return "Actual status: " +
                "\n\tPM2.5: " + pm25 + " µg/m³, " +
                "\n\tPM10: " + pm10 + " µg/m³, " +
                "\n\tVOC: " + voc + " ppb, " +
                "\n\tCO: " + co + " ppm, " +
                "\n\tTemperature: " + temperature + " °C, " +
                "\n\tHumidity: " + humidity + "%";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sensor{");
        sb.append("pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", voc=").append(voc);
        sb.append(", co=").append(co);
        sb.append(", temperature=").append(temperature);
        sb.append(", humidity=").append(humidity);
        sb.append('}');
        return sb.toString();
    }
}
