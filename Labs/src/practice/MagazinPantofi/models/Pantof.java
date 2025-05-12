package practice.MagazinPantofi.models;

public class Pantof {
    private double price;
    private String material;
    private String brand;
    private int size;

    public Pantof(double price, String material, String brand, int size) {
        this.price = price;
        this.material = material;
        this.brand = brand;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantof{");
        sb.append("price=").append(price);
        sb.append(", material='").append(material).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
