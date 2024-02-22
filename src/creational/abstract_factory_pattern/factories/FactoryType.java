package creational.abstract_factory_pattern.factories;

public enum FactoryType {
    foreign (new ForeignProductFactory()),
    national (new NationalProductFactory());

    private Factory factory;

    FactoryType(Factory factory){
        this.factory = factory;
    }

    public Factory getFactory(){
        return factory;
    }
}
