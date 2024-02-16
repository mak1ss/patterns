package creational.abstract_factory_pattern.factories;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AbstractProductFactory {
    private static final Map<String, Class<? extends Factory>> factories = new HashMap<>();

    static {
        factories.put("national", NationalProductFactory.class);
        factories.put("foreign", ForeignProductFactory.class);
    }

    public static Factory getProductFactory(String factoryType) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        if(!factories.containsKey(factoryType.toLowerCase())){
            throw new IllegalArgumentException("Unknown type of factory");
        }
        Constructor<? extends Factory> constructor;
        try {
            constructor = factories.get(factoryType).getConstructor();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Provided factory class doesn't contain any public constructor without arguments");
        }

        return constructor.newInstance();
    }
}
