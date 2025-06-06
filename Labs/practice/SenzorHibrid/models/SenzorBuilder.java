package Creationale.X_Practice.SenzorHibrid.models;

public class SenzorBuilder implements IBuilder{
    private int pm25;
    private int pm10;
    private int voc;
    private int co;
    private int temperature;
    private int humidity;

    public SenzorBuilder() {
    }

    public SenzorBuilder setPm25(int pm25) {
        this.pm25 = pm25;
        return this;
    }

    public SenzorBuilder setPm10(int pm10) {
        this.pm10 = pm10;
        return this;
    }

    public SenzorBuilder setVoc(int voc) {
        this.voc = voc;
        return this;
    }

    public SenzorBuilder setCo(int co) {
        this.co = co;
        return this;
    }

    public SenzorBuilder setTemperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    public SenzorBuilder setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    @Override
    public AbstractAirQualitySensor build() {
        AbstractAirQualitySensor airQualitySensor =  new Senzor(pm25, pm10, voc, co, temperature, humidity);

        this.pm25 = 0;
        this.pm10 = 0;
        this.voc = 0;
        this.co = 0;
        this.temperature = 0;
        this.humidity = 0;

        return airQualitySensor;
    }
}
