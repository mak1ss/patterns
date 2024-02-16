package creational.builder_pattern;

import creational.builder_pattern.builders.Builder;

public class Director {

    public void createMilk(Builder builder){
        builder.setProductName("MILK")
                .setProductPrice(25.50)
                .setProductWeight(0.5)
                .setAllowedForKids(true)
                .setSupplierName("BIEDRONKA");
    }

    public void createPizza(Builder builder){
        builder.setProductName("PIZZA")
                .setProductPrice(120.30)
                .setProductWeight(0.75)
                .setExportedToOtherCountries(true);

    }


}
