package liskovSubstitution.best;

import liskovSubstitution.best.models.Product;

public class ProductRepository extends BaseRepository{
    @Override
    protected Object create(Object entity) {
        return null;
    }

    @Override
    protected Object update(Object entity) {
        return null;
    }
    public void delete(Product product) {

    }
}
