package builder_pattern.builders;

import builder_pattern.Entities.ForeignProduct;

public class ForeignProductBuilder implements Builder{

    private double price;
    private double weight;
    private String name;
    private boolean isAllowedForKids;
    private boolean isExportedToOtherCountries;
    private String supplierName;
    @Override
    public Builder setProductPrice(double price) {
        this.price = price + price * 0.5;
        return this;
    }

    @Override
    public Builder setProductWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Builder setProductName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setAllowedForKids(boolean isAllowedForKids) {
        this.isAllowedForKids = isAllowedForKids;
        return this;
    }

    @Override
    public Builder setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    @Override
    public Builder setExportedToOtherCountries(boolean isExportedToOtherCountries) {
        this.isExportedToOtherCountries = isExportedToOtherCountries;
        return this;
    }

    public ForeignProduct build(){
        return new ForeignProduct(price, weight, name, isAllowedForKids, isExportedToOtherCountries, supplierName);
    }
}
