package creational.builder_pattern.builders;

public interface Builder {
    Builder setProductPrice(double price);

    Builder setProductWeight(double weight);

    Builder setProductName(String name);

    Builder setAllowedForKids(boolean isAllowedForKids);

    Builder setSupplierName(String supplierName);

    Builder setExportedToOtherCountries(boolean isExportedToOtherCountries);
}
