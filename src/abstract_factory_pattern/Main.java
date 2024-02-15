package abstract_factory_pattern;


import abstract_factory_pattern.factories.AbstractProductFactory;
import abstract_factory_pattern.factories.Factory;


import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Factory factory;
        try {
            factory = AbstractProductFactory.getProductFactory("foreign");
            System.out.println(factory.createProduct());

            factory = AbstractProductFactory.getProductFactory("national");
            System.out.println(factory.createProduct());
        } catch (Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
