package Creationale.X_Practice.GestionareCamereHotel.models;

public enum TipCamera {
    SINGLE(1),
    DOUBLE(2),
    SUITE(1),
    INVALID(0);

    private int nrPaturi;

    TipCamera(int nrPaturi) {
        this.nrPaturi = nrPaturi;
    }

    public int getNrPaturi() {
        return nrPaturi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TipCamera{");
        sb.append("tipCamera=").append(name());
        sb.append("nrPaturi=").append(nrPaturi);
        sb.append('}');
        return sb.toString();
    }
}
