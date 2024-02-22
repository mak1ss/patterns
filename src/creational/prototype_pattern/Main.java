package creational.prototype_pattern;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(13.5, 0.5, "Milk");
        Product clone = product.doClone();
        System.out.println(product.hashCode() + " - " + product);

        System.out.println(clone.hashCode() + " - " + product);
    }

}
