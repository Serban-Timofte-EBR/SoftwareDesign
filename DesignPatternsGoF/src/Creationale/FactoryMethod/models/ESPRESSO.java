package Creationale.FactoryMethod.models;

public class ESPRESSO implements Bautura{
    private String name = "Espresso";
    private double price = 12.5;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ESPRESSO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void prepara() {
        System.out.println("Se prepara: " + name);
    }
}
