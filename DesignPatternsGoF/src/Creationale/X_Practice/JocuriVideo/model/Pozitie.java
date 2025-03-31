package Creationale.X_Practice.JocuriVideo.model;

public class Pozitie {
    private int x;
    private int y;

    public Pozitie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pozitie pozitie = (Pozitie) obj;
        return x == pozitie.x && y == pozitie.y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pozitie{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
