package singleton.best;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
    private static List<Product> products = new ArrayList<>();

    public void add(Product product) {
        Validation.productValidation(product);
        products.add(product);
    }


    public List<Product> getAll() {
        return products;
    }
}
