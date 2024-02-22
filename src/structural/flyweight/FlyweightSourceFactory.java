package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightSourceFactory {
    private static FlyweightSourceFactory self;
    private Map<ServiceType, Service> cache;

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

    public Service getFlyweightService(ServiceType services) {
        if (!cache.containsKey(services)) {
            cache.put(services, services.getService());
        }

        return cache.get(services);
    }

}
