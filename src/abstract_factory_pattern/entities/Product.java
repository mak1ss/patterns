package abstract_factory_pattern.entities;

public abstract class Product {
    protected double price;
    protected double weight;

    protected String name;

    protected Product(double price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }
}
