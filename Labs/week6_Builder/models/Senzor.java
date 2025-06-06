package week6_Builder.models;

public class Senzor implements AbstractAirQualitySensor {
    private int pm10;
    private int temparatura;
    private int umiditate;
    private int pm25;

    Senzor(int temparatura) {
        this.temparatura = temparatura;
    }

    Senzor(int pm10, int temparatura, int umiditate, int pm25) {
        this.pm10 = pm10;
        this.temparatura = temparatura;
        this.umiditate = umiditate;
        this.pm25 = pm25;
    }

    @Override
    public int getPM10() {
        return this.pm10;
    }

    @Override
    public int getTemperatura() {
        return this.temparatura;
    }

    @Override
    public int getUmiditate() {
        return this.umiditate;
    }

    @Override
    public int getPM25() {
        return this.pm25;
    }

    void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    void setTemparatura(int temparatura) {
        this.temparatura = temparatura;
    }

    void setUmiditate(int umiditate) {
        this.umiditate = umiditate;
    }

    void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Senzor{");
        sb.append("pm10=").append(pm10);
        sb.append(", temparatura=").append(temparatura);
        sb.append(", umiditate=").append(umiditate);
        sb.append(", pm25=").append(pm25);
        sb.append('}');
        return sb.toString();
    }
}
