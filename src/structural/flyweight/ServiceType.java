package structural.flyweight;

public enum ServiceType {
    hibernate (new HibernateService()),
    jdbc (new JdbcService());

    private Service service;

    ServiceType(Service service){
        this.service = service;
    }

    public Service getService(){
        return service;
    }
}
