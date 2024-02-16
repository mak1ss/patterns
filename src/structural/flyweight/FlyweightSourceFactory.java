package structural.flyweight;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class FlyweightSourceFactory {
    private static FlyweightSourceFactory self;
    private Map<Class<? extends Service>, Service> cache;

    private FlyweightSourceFactory(){
        cache = new HashMap<>();
    }
    public static FlyweightSourceFactory getInstance() {
        if (self == null) {
            synchronized (FlyweightSourceFactory.class) {
                if(self == null){
                    self = new FlyweightSourceFactory();
                }
            }
        }

        return self;
    }

    public Service getFlyweightService(Class<? extends Service> key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        Service flyweight;
        try {
            flyweight = key.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        cache.put(key, flyweight);
        return flyweight;
    }

}
