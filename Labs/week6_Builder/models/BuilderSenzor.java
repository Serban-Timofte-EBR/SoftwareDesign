package week6_Builder.models;

public class BuilderSenzor implements IBuilder{
//    private Senzor senzor; // Objectul pe care il construim prin acest builder -> Alta posibila de a construi obiectul

    // Mai eficienta pentru validari
    private int pm10;
    private int temparatura;
    private int umiditate;
    private int pm25;

    // Primim ca param zona obligatorie a obiectului senzor
    public BuilderSenzor(int temparatura) {
        this.temparatura = temparatura;
    }

    // Se adauga setteri pentru fiecare camp optional
    public BuilderSenzor setPm10(int pm10) {
        this.pm10 = pm10;
        return this;
    }

    public BuilderSenzor setUmiditate(int umiditate) {
        this.umiditate = umiditate;
        return this;
    }

    public BuilderSenzor setPm25(int pm25) {
        this.pm25 = pm25;
        return this;
    }

    @Override
    public AbstractAirQualitySensor build() {
        Senzor builtInstance = new Senzor(pm10, temparatura, umiditate, pm25);

        this.pm10 = 0;
        this.pm25 = 0;
        this.umiditate = 0;

        return builtInstance;
    }
}
