package builder_pattern.builders;

import builder_pattern.Entities.Product;

public class ProductBuilder implements Builder{

    private double price;
    private double weight;
    private String name;
    private boolean isAllowedForKids;
    private boolean isExportedToOtherCountries;
    private String supplierName;

    public ProductBuilder setProductPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setProductWeight(double weight){
        this.weight = weight;
        return this;
    }

    public ProductBuilder setProductName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setAllowedForKids(boolean allowedForKids) {
        isAllowedForKids = allowedForKids;
        return this;
    }

    public ProductBuilder setExportedToOtherCountries(boolean exportedToOtherCountries) {
        isExportedToOtherCountries = exportedToOtherCountries;
        return this;
    }

    public ProductBuilder setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    public Product build() {
        return new Product(price, weight, name, isAllowedForKids, isExportedToOtherCountries, supplierName);
    }
}
