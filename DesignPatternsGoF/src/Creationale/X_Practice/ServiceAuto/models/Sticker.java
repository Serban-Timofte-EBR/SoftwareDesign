package Creationale.X_Practice.ServiceAuto.models;

import static Creationale.X_Practice.ServiceAuto.models.ModeleMasini.BMW;
import static Creationale.X_Practice.ServiceAuto.models.ModeleMasini.SKODA;
import static Creationale.X_Practice.ServiceAuto.models.ModeleMasini.VOLVO;

public class Sticker implements ISticker {
    private double lungime;
    private double latime;
    private String culoare;

    public Sticker(Masina masina) {
        switch (masina.getModel()) {
            case SKODA:
                this.lungime = 10;
                this.latime = 5;
                this.culoare = "alb";
                break;
            case VOLVO:
                this.lungime = 15;
                this.latime = 10;
                this.culoare = "negru";
                break;
            case BMW:
                this.lungime = 20;
                this.latime = 15;
                this.culoare = "rosu";
                break;
        }
    }

    private Sticker() {
    }

    public Sticker setLungime(double lungime) {
        this.lungime = lungime;
        return this;
    }

    public Sticker setLatime(double latime) {
        this.latime = latime;
        return this;
    }

    public Sticker setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }

    @Override
    public Sticker cloneSticker() {
        Sticker clone = new Sticker();
        clone.lungime = this.lungime;
        clone.latime = this.latime;
        clone.culoare = this.culoare;
        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("lungime=").append(lungime);
        sb.append(", latime=").append(latime);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
