package week14_junit.clase;

import week14_junit.exceptii.ExceptieModelLen;
import week14_junit.exceptii.ExceptieModelNull;
import week14_junit.exceptii.ExceptiePret;

public class Masina {
    private String model;
    private double pret;
    private int anFabricatie;

    public Masina(String model, double pret, int anFabricatie) throws Exception {
        if (model == null) {
            throw new ExceptieModelNull();
        }

        if (model.length() < 2 || model.isEmpty()) {
            throw new ExceptieModelLen();
        }

        if (pret <= 1000 || pret >100000) {
            throw new ExceptiePret();
        }

        this.model = model;
        this.pret = pret;
        this.anFabricatie = anFabricatie;
    }

    public Masina() {
        this.model = "NA";
        this.pret = 0;
        this.anFabricatie = 1900;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setPret(double pret) throws ExceptiePret {
        if (pret <= 1000 || pret >100000) {
            // Trebuie sa prindem si aceasta posibila greseala
            this.pret = pret;
            throw new ExceptiePret();
        }
        this.pret = pret;
    }


}
