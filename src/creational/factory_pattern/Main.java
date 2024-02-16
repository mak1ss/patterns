package creational.factory_pattern;

import creational.factory_pattern.entities.Product;
import creational.factory_pattern.factories.Factory;
import creational.factory_pattern.factories.ForeignProductFactory;
import creational.factory_pattern.factories.NationalProductFactory;

public class Main {
    public static void main(String[] args) {
        Factory nFactory = new NationalProductFactory();

        Product np = nFactory.createProduct();
        System.out.println(np);

        nFactory = new ForeignProductFactory();

        Product fp = nFactory.createProduct();
        System.out.println(fp);
    }
}
