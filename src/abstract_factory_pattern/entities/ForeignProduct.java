package abstract_factory_pattern.entities;

public class ForeignProduct extends Product {

    private double healthRating;

    public ForeignProduct(double healthRating, double price, double weight, String name) {
        super(price, weight, name);
        this.healthRating = healthRating;
    }

    @Override
    public String toString() {
        return "ForeignProduct{" +
                "healthRating=" + healthRating +
                ", price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
