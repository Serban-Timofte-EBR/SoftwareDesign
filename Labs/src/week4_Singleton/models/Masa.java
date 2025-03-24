package week4_Singleton.models;


public class Masa {
    private int idMasa;
    private boolean isAfara;
    private int nrScaune;

    public Masa(int idMasa, int nrScaune, boolean isAfara) {
        this.idMasa = idMasa;
        this.isAfara = isAfara;
        this.nrScaune = nrScaune;
    }

    public int getIdMasa() {
        return idMasa;
    }

    public boolean isAfara() {
        return isAfara;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("idMasa=").append(idMasa);
        sb.append(", isAfara=").append(isAfara);
        sb.append(", nrScaune=").append(nrScaune);
        sb.append('}');
        return sb.toString();
    }
}
