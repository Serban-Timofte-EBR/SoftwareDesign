package Creationale.X_Practice.ServiceAuto.models;

public enum ModeleMasini {
    SKODA(2001),
    VOLVO(2014),
    BMW(2018);

    private final int anFabricatie;

    ModeleMasini(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getDenumireModel() {
        return this.name();
    }

    public int getAnFabricatie() {
        return this.anFabricatie;
    }
}
