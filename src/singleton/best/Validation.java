package singleton.best;

public class Validation {
    public static void productValidation(Product product) {
        if (product.getCategory().isBlank()) {
            throw new NullPointerException("Category cannot be null");
        } else if (product.getName().isBlank()) {
            throw new NullPointerException("Name cannot be null");
        } else if (product.getPrice() <= 0) {
            throw new NullPointerException("Price cannot be zero and less than zero");
        }
    }
}
