package creational.builder_pattern.builders;

import creational.builder_pattern.Entities.Product;

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
        return new Product(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAllowedForKids() {
        return isAllowedForKids;
    }

    public boolean isExportedToOtherCountries() {
        return isExportedToOtherCountries;
    }

    public String getSupplierName() {
        return supplierName;
    }
}
