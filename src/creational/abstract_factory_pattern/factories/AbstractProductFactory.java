package creational.abstract_factory_pattern.factories;

import java.util.HashMap;
import java.util.Map;

public class AbstractProductFactory {
    private static final Map<FactoryType, Factory> factories = new HashMap<>();

    static {
        factories.put(FactoryType.national, new NationalProductFactory());
        factories.put(FactoryType.foreign, new ForeignProductFactory());
    }

    public static Factory getProductFactory(FactoryType factoryType){
        if(!factories.containsKey(factoryType)){
            factories.put(factoryType, factoryType.getFactory());
        }

        return factories.get(factoryType);
    }
}
