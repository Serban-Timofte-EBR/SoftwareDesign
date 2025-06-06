package Creationale.X_Practice.VehiculeInchiriate.models;

public enum VehicleType {
    MASINA(true),
    SCUTER(true),
    BICICLETA(false);

    private boolean hasEngine;

    VehicleType(boolean hasEngine) {}

    public boolean hasEngine() {
        return hasEngine;
    }
}
