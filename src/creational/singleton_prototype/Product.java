package creational.singleton_prototype;

public class Product {

    private static Product singletonProduct;
    private double price;
    private double weight;
    private String name;

    private Product(double price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public static Product getInstance(double price, double weight, String name){
        if(singletonProduct == null) {
            singletonProduct = new Product(price, weight, name);
        }
        return singletonProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
