package Creationale.X_Practice.ServiceAuto.models;

public class Masina implements IMasina{
    private ModeleMasini model;

    public Masina(ModeleMasini model) {
        this.model = model;
    }

    public ModeleMasini getModel() {
        return model;
    }

    @Override
    public String getModelMasina() {
        return this.model.name();
    }

    @Override
    public int getAnFabricatie() {
        return this.model.getAnFabricatie();
    }
}
