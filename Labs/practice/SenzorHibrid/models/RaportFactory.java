package Creationale.X_Practice.SenzorHibrid.models;

public class RaportFactory implements IFactory{
    @Override
    public AbstractAirQualityReport createAirQualityReport(int pm25) {
        if (0 <= pm25 && pm25 <= 30) {
            return new RaportAerCurat("21-10-2024", "Focsani");
        } else if (31 <= pm25 && pm25 <= 70) {
            return new RaportAvertizare("21-10-2024", "Focsani");
        } else if (71 <= pm25) {
            return new RaportRiscAsupraSanatatii("21-10-2024", "Focsani");
        } else {
            System.out.println("Valoare PM2.5 invalida");
            return null;
        }
    }
}
