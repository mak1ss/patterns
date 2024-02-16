package creational.builder_pattern.Entities;

public class ForeignProduct {
    private double price;
    private double weight;
    private String name;
    private boolean isAllowedForKids;
    private boolean isExportedToOtherCountries;
    private String supplierName;

    public ForeignProduct(double price, double weight, String name, boolean isAllowedForKids, boolean isExportedToOtherCountries, String supplierName) {
        this.price = price;
        this.weight = weight;
        this.name = name;
        this.isAllowedForKids = isAllowedForKids;
        this.isExportedToOtherCountries = isExportedToOtherCountries;
        this.supplierName = supplierName;
    }

    public ForeignProduct(){

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

    public void setAllowedForKids(boolean allowedForKids) {
        isAllowedForKids = allowedForKids;
    }

    public boolean isExportedToOtherCountries() {
        return isExportedToOtherCountries;
    }

    public void setExportedToOtherCountries(boolean exportedToOtherCountries) {
        isExportedToOtherCountries = exportedToOtherCountries;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "ForeignProduct{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", isAllowedForKids=" + isAllowedForKids +
                ", isExportedToOtherCountries=" + isExportedToOtherCountries +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}
