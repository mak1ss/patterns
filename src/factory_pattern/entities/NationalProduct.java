package factory_pattern.entities;

public class NationalProduct extends Product{

    public NationalProduct(double price, double weight, String name) {
        super(price - price * 0.3, weight, name);
    }

    @Override
    public String toString() {
        return "NationalProduct{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
