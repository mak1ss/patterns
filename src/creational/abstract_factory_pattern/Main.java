package creational.abstract_factory_pattern;


import creational.abstract_factory_pattern.factories.AbstractProductFactory;
import creational.abstract_factory_pattern.factories.FactoryType;
import creational.abstract_factory_pattern.factories.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = AbstractProductFactory.getProductFactory(FactoryType.foreign);
        System.out.println(factory.createProduct());

        factory = AbstractProductFactory.getProductFactory(FactoryType.national);
        System.out.println(factory.createProduct());

    }
}
