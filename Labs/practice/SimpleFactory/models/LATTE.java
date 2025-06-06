package Creationale.SimpleFactory.models;

public class LATTE implements Bautura{
    private String name = "Latte";
    private double pret = 20.5;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LATTE{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void prepara() {
        System.out.println("Se prepara: " + name);
    }
}
