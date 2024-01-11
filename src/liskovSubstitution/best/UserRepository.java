package liskovSubstitution.best;

import liskovSubstitution.best.models.User;

public class UserRepository extends BaseRepository{
    @Override
    protected Object create(Object entity) {
        return null;
    }

    @Override
    protected Object update(Object entity) {
        return null;
    }
    public User getByEmail(String email) {
        return new User();
    }
}
