package Creationale.X_Practice.SenzorHibrid.program;

import Creationale.X_Practice.SenzorHibrid.models.AbstractAirQualityReport;
import Creationale.X_Practice.SenzorHibrid.models.RaportFactory;
import Creationale.X_Practice.SenzorHibrid.models.Senzor;
import Creationale.X_Practice.SenzorHibrid.models.SenzorBuilder;

public class Main {
    public static void main(String[] args) {
        RaportFactory factory = new RaportFactory();

        AbstractAirQualityReport report1 = factory.createAirQualityReport(32);
        System.out.println(report1.generareRezumatRaport());

        AbstractAirQualityReport report2 = factory.createAirQualityReport(10);
        System.out.println(report2.generareRezumatRaport());

        AbstractAirQualityReport report3 = factory.createAirQualityReport(80);
        System.out.println(report3.generareRezumatRaport());

        SenzorBuilder builder = new SenzorBuilder();

        Senzor senzor = (Senzor) builder
                .setHumidity(21)
                .setCo(21)
                .setTemperature(21)
                .build();

        System.out.println(senzor.getInstantMeasurements());

        Senzor senzor1 = (Senzor) builder
                .setPm25(33)
                .setVoc(33)
                .setCo(33)
                .build();
        System.out.println(senzor1.getInstantMeasurements());
    }
}
