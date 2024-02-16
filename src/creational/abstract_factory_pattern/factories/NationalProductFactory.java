package creational.abstract_factory_pattern.factories;

import creational.abstract_factory_pattern.entities.NationalProduct;

public class NationalProductFactory implements Factory {
    @Override
    public NationalProduct createProduct() {
        return new NationalProduct(120.35, 30, "BORSCH");
    }
}
