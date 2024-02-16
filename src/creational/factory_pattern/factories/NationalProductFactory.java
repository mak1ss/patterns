package creational.factory_pattern.factories;

import creational.factory_pattern.entities.NationalProduct;

public class NationalProductFactory implements Factory{
    @Override
    public NationalProduct createProduct() {
        return new NationalProduct(120.35, 30, "BORSCH");
    }
}
