package Creationale.X_Practice.Tort.models;

import java.util.ArrayList;
import java.util.List;

public class CakeBuilder implements IBuilder {
    private CakeDimension dimension;
    private String taste;
    private String glaze;
    private List<String> decorations;

    public CakeBuilder(CakeDimension dimension, String glaze) {
        this.dimension = dimension;
        this.glaze = glaze;
        this.decorations = new ArrayList<>();
    }

    public CakeBuilder(Cake cake) {
        this.dimension = cake.getDimension();
        this.taste = cake.getTaste();
        this.glaze = cake.getGlaze();
        this.decorations = new ArrayList<>(cake.getDecorations());
    }

    public CakeBuilder setGlaze(String glaze) {
        this.glaze = glaze;
        return this;
    }

    public CakeBuilder addDecoration(String decoration) {
        this.decorations.add(decoration);
        return this;
    }

    @Override
    public Cake build() {
        Cake cake = new Cake(decorations, dimension, glaze, taste);

        this.glaze = "";
        this.decorations = new ArrayList<>();

        return cake;
    }
}
