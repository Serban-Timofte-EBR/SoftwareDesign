package Creationale.X_Practice.Tort.models;

import java.util.ArrayList;
import java.util.List;

public class Cake implements AbstractCakeMethods {
    private CakeDimension dimension;
    private String taste;
    private String glaze;
    private List<String> decorations;

    Cake(List<String> decorations, CakeDimension dimension, String glaze, String taste) {
        this.decorations = decorations;
        this.dimension = dimension;
        this.glaze = glaze;
        this.taste = taste;
    }

    public List<String> getDecorations() {
        return decorations;
    }

    public CakeDimension getDimension() {
        return dimension;
    }

    public String getGlaze() {
        return glaze;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public Cake cloneCake() {
        try {
            Cake clone = (Cake) super.clone();
            clone.decorations = new ArrayList<>(this.decorations);
            return clone;
        } catch (CloneNotSupportedException e) {
            System.out.println("[ERROR] CloneNotSupportedException for Cake");
            return null;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cake{");
        sb.append("decorations=").append(decorations);
        sb.append(", dimension=").append(dimension);
        sb.append(", taste='").append(taste).append('\'');
        sb.append(", glaze='").append(glaze).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
