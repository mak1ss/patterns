package builder_pattern;

import builder_pattern.Entities.Product;
import builder_pattern.builders.ForeignProductBuilder;
import builder_pattern.builders.ProductBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ProductBuilder pd = new ProductBuilder();
        director.createPizza(pd);
        Product product = pd.build();

        System.out.println(product);

        ForeignProductBuilder fpd = new ForeignProductBuilder();

        director.createPizza(fpd);

        System.out.println(fpd.build());
    }
}