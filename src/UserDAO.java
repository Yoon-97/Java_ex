import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> db = new HashMap<>();

    public void save(User user) {
        db.put(user.getId(), user);
    }

    public Map<String, User> getDb() {
        return db;
    }
}
