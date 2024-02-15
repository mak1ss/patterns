package factory_pattern;

import factory_pattern.entities.Product;
import factory_pattern.factories.Factory;
import factory_pattern.factories.ForeignProductFactory;
import factory_pattern.factories.NationalProductFactory;

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
