package factory_pattern.factories;

import factory_pattern.entities.ForeignProduct;

public class ForeignProductFactory implements Factory{
    @Override
    public ForeignProduct createProduct() {
        return new ForeignProduct(3.0, 150.10, 0.5, "PIZZA");
    }
}
