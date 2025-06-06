package week5_Prototype.modele;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements ICloneJucator {
    private String name;
    private TipJucator tip;
    private List<String> medicamente;
    private List<String> antrenamente;

    protected Jucator(String name, TipJucator tip) throws InterruptedException {
        System.out.println("Preluarea din surse externe despre medicamente si antrenamente");
        Thread.sleep(200); // Simulare preluare informatii extenre
        this.name = name;

        // Simulez ca dureaza mult ca citesc din surse externe
        switch (tip) {
            case ATACANT -> {
                medicamente = new ArrayList<>(List.of("med1", "med2", "med3", "med4"));
                antrenamente = new ArrayList<>(List.of("antAtacant1", "antAtacant2", "antAtacant3", "antAtacant4"));
            }
            case MIJLOCAS -> {
                medicamente = new ArrayList<>(List.of("med3", "med4", "med5"));
                antrenamente = new ArrayList<>(List.of("antMijlocas1", "antMijlocas2", "antMijlocas3"));
            }
            case FUNDAS -> {
                medicamente = new ArrayList<>(List.of("med6", "med7", "med8"));
                antrenamente = new ArrayList<>(List.of("antFundas1", "antFundas2", "antFundas3"));
            }
            case PORTAR -> {
                medicamente = new ArrayList<>(List.of("med8", "med9", "med10"));
                antrenamente = new ArrayList<>(List.of("antPortar1", "antPortar2", "antPortar3"));
            }
        }
        this.tip = tip;
    }

    @Override
    protected Jucator clone() throws CloneNotSupportedException {
        Jucator clone = (Jucator) super.clone();
        clone.medicamente = this.medicamente; // same reference (shared)
        clone.antrenamente = new ArrayList<>(this.antrenamente); // deep copy
        return clone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMedicamente(String medicament) {
        this.medicamente.add(medicament);
    }

    public void addAntrenamente(String antrenamente) {
        this.antrenamente.add(antrenamente);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("name='").append(name).append('\'');
        sb.append(", tip=").append(tip);
        sb.append(", medicamente=").append(medicamente);
        sb.append(", antrenamente=").append(antrenamente);
        sb.append('}');
        return sb.toString();
    }
}
